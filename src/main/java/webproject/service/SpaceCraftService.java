package webproject.service;

import org.apache.commons.lang3.StringUtils;
import webproject.repository.spacecraftrep.SpaceCraftUrl;

import static webproject.repository.spacecraftrep.SpaceCraftUrl.TEAM;

public class SpaceCraftService implements Service<String> {
    private String htmlName;

    public SpaceCraftService(String htmlName) {
        this.htmlName = htmlName;
    }

    @Override
    public String launch() {
        if (StringUtils.isBlank(htmlName)) {
            throw new NullPointerException("Параметр params пришел пустым");
        }
        SpaceCraftUrl enumSpaceCraft = SpaceCraftUrl.valueOf(htmlName);

        return switch (enumSpaceCraft) {
            case TEAM -> TEAM.getUrl();
            default -> throw new IllegalStateException("По переданному параметру: " + htmlName + " нет существующих страниц");
        };
    }
}
