package inline.klazz;

class TelephoneNumber {
    private String number;
    private String areaCode;

    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String arg) {
        areaCode = arg;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String arg) {
        number = arg;
    }
    public String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }
}