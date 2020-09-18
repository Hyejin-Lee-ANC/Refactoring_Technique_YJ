package form.template.method;

class Article {
    String title;
    String intro;
    String body;
    String author;
    String date;

    public String getTitle() {
        return title;
    }

    public String getIntro() {
        return intro;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String markdownView() {
        String output = "# " + getTitle() + "\n\n";
        output += "> " + getIntro() + "\n\n";
        output += getBody() + "\n\n";
        output += "_Written by " + getAuthor() + " on " + getDate() + "_";
        return output;
    }

    public String htmlView() {
        String output = "<h2>" + getTitle() + "</h2>" + "\n";
        output += "<blockquote>" + getIntro() + "</blockquote>" + "\n";
        output += "<p>" + getBody() + "</p>" + "\n";
        output += "<em>Written by " + getAuthor() + " on " + getDate() + "</em>";
        return output;
    }
}