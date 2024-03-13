package org.example.textblocks;

/**
 * @author Terrance Nyamfukudza
 * 9/3/2024
 */
public class TextBlocks {
    public static void main(String[] args) {
        String name = """
                Terrance Nyamfukudza
                9/3/2024
                """;// creates a white space atv the bottom of the text
        System.out.println(name);

        String getBlockOfHtml = """
            <html>

                <body>
                    <span>example text</span>
                </body>
            </html>""";
        System.out.println(getBlockOfHtml);

        String getTextWithEscapes ="""
            "fun" with
            whitespace
            and other escapes \"""
            """;
        System.out.println(getTextWithEscapes);

        String getTextWithCarriageReturns ="""
            separated with\r
            carriage returns""";
        System.out.println(getTextWithCarriageReturns);

        String getIgnoredNewLines = """
            This is a long test which looks to \
            have a newline but actually does not""";
        System.out.println(getIgnoredNewLines);
    }
}
