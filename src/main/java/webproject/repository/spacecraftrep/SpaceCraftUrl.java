package webproject.repository.spacecraftrep;

public enum SpaceCraftUrl {
    START("/WEB-INF/spacecraftweb/prologue.jsp"),
    PROLOGUE("/WEB-INF/spacecraftweb/crew.jsp"),
    CREW("/WEB-INF/spacecraftweb/nlo.jsp"),
    NLO("/WEB-INF/spacecraftweb/bridge.jsp"),
    BRIDGE("/WEB-INF/spacecraftweb/whoAreYou.jsp"),
    WHO_ARE_YOU("/WEB-INF/spacecraftweb/win.jsp"),
    LOSS("/WEB-INF/spacecraftweb/loss.jsp"),
    WIN("/index.jsp");

    private String name;
    private String url;

    SpaceCraftUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
