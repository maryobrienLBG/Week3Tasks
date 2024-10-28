public class Country extends EU {
    public String countryName;

    public Country(String name) {
        this.countryName = name;
    }

    public Country(String name, String currency) {
        this.countryName = name;
        this.currency = currency;
    }

    public static void main(String[] args) {

        EU fr = new Country("France");
        EU po = new Country("Poland", "Zloty");

        System.out.println(((Country) fr).countryName + " uses the currency " + fr.currency);
        fr.laws();
        System.out.println(((Country) po).countryName + " uses the currency " + po.currency);
        po.laws();
    }
}
