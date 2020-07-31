package com.yogadimas.faunaindonesia;

public class Animals {

    private int picture;
    private String codename;
    private String version;
    private String screenshot;
    private String description;
    private String ilmiah;
    private String kingdom;
    private String phylum;
    private String kelas;
    private String order;
    private String family;
    private String genus;
    private String species;

    public Animals(int picture, String codename, String version, String screenshot, String description, String ilmiah,
                   String kingdom, String phylum, String kelas, String order, String family, String genus, String species) {
        this.picture = picture;
        this.codename = codename;
        this.version = version;
        this.screenshot = screenshot;
        this.description = description;
        this.ilmiah = ilmiah;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.kelas = kelas;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
    }

    public int getPicture() {
        return picture;
    }

    public String getCodename() {
        return codename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public String getDescription() {
        return description;
    }

    public String getIlmiah() {
        return ilmiah;
    }

    public String getKingdom() {
        return kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public String getKelas() {
        return kelas;
    }

    public String getOrder() {
        return order;
    }

    public String getFamily() {
        return family;
    }

    public String getGenus() {
        return genus;
    }

    public String getSpecies() {
        return species;
    }
}
