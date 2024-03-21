/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author quanb
 */
public abstract class People implements Comparable<People> {

    public static final String SEPARATOR = ",";
    private static final int ATTRIBUTE_COUNT = 3;

    private String id;
    private String name;
    private String address;

    public String getId() {
        return id;
    }

    public final void setId(String id) {
        if (Utils.validateString(id, getIdPattern(), true)) {
            this.id = id.toUpperCase();
        }
    }

    public String getName() {
        return this.name;
    }

    public final void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }

    public String getAddress() {
        return this.address;
    }

    public final void setAddress(String address) {
        if (!address.isBlank()) {
            this.address = address;
        }
    }

    public People() {
    }

    public People(String id, String name, String address) {
        setId(id);
        setName(name);
        setAddress(address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        sb.append(People.SEPARATOR);
        sb.append(this.name);
        sb.append(People.SEPARATOR);
        sb.append(this.address);
        return sb.toString();
    }

    public boolean parseString(String stringPeople) {
        if (stringPeople != null) {
            return setAttribute(stringPeople.split(People.SEPARATOR));
        }
        return false;
    }

    public boolean setAttribute(String attributes[]) {
        if (attributes != null && attributes.length >= getAttributeCount()) {
            int idx = 0;
            setId(attributes[idx++].trim());
            setName(attributes[idx++].trim());
            setAddress(attributes[idx++].trim());
            return true;
        }
        return false;
    }

    public void input() {
        this.id = inputId();
        this.name = Utils.inputString("Please enter name (not blank or empty)").trim();
        this.address = Utils.inputString("Please enter address (not blank or empty)").trim();
    }

    public void output() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" {");
        sb.append(toString());
        sb.append("}");
        System.out.println(sb.toString());
    }

    @Override
    public int compareTo(People o) {
        return this.id.compareTo(o.id);
    }

    /**
     * Get id prefix
     * @return id prefix
     */
    protected abstract String getIdPrefix();

    /**
     * Get id pattern
     * @return id pattern
     */
    protected abstract String getIdPattern();
    
    protected int getAttributeCount() {
        return People.ATTRIBUTE_COUNT;
    }

    private String inputId() {
        String inputId;
        String regex = getIdPattern();
        do {
            inputId = Utils.inputString("Please enter the id with the pattern(" + regex + ")");
        } while (!Utils.validateString(inputId, regex, true));

        return inputId.toUpperCase();
    }

}