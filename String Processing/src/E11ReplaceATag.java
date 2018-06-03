import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E11ReplaceATag {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while (!line.equals("END")) {
                sb.append(line);
                sb.append(String.format("%n"));
                line = br.readLine();
            }

            String regex = "(?<openingTag><a).+?href=\".*?\".*?(?<tag>>).*?(?<closingTag><\\/a>)";
            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.DOTALL);
            Matcher matcher = pattern.matcher(sb);

            String[][] regexTags = new String[][]{
                    {"closingTag", "[/URL]"},
                    {"tag", "]"},
                    {"openingTag", "[URL"}
            };

            while (matcher.find()) {

                for (int i = 0; i < regexTags.length; i++) {
                    int startIndex = matcher.start(regexTags[i][0]);
                    int endIndex = startIndex + matcher.group(regexTags[i][0]).length();

                    sb = sb.replace(startIndex, endIndex, regexTags[i][1]);
                }

                matcher = pattern.matcher(sb);
            }

            System.out.println(sb.toString());
        }
    }
