package webproject.repository.spacecraftrep;

public enum SpaceCraftUrl {
    TEAM("team","/WEB-INF/spacecraftweb/team.jsp");

    private String name;
    private String url;

    SpaceCraftUrl(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
