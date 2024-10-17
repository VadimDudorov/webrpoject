package webproject.service;

import org.apache.commons.lang3.StringUtils;
import webproject.repository.spacecraftrep.SpaceCraftUrl;

import static webproject.repository.spacecraftrep.SpaceCraftUrl.*;

public class SpaceCraftService implements Service<String> {
    @Override
    public String launch(String ... params) {
        if (StringUtils.isBlank(params[0])) {
            throw new NullPointerException("Параметр params пришел пустым");
        }
        SpaceCraftUrl enumSpaceCraft = SpaceCraftUrl.valueOf(params[0].toUpperCase());

        return switch (enumSpaceCraft) {
            case PROLOGUE -> PROLOGUE.getUrl();
            case CREW -> CREW.getUrl();
            case NLO -> NLO.getUrl();
            case BRIDGE -> BRIDGE.getUrl();
            case WHO_ARE_YOU -> WHO_ARE_YOU.getUrl();
            case LOSS -> LOSS.getUrl();
            default -> throw new IllegalStateException("По переданному параметру: " + params[0] + " нет существующих страниц");
        };
    }
}
