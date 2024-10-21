package webproject.repository.main;

public enum mainUrl {
    MAIN_URL("/WEB-INF/authorization/main.jsp"),
    UNAUTHORIZED_EXCEPTION("/WEB-INF/authorization/unauthorized.jsp");

    private String url;

    mainUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
