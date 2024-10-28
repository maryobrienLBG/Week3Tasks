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
        EU it = new Country("Italy");
        EU cz = new Country("Czech Republic", "Krone");

        Country[] countries = {(Country) fr, (Country) po, (Country) it, (Country) cz};

        for (Country country : countries) {
            System.out.println("Country name: " + country.countryName);
            country.laws();
            System.out.println("Currency: " + country.currency);
            if (country.currency != "Euro") {
                System.out.println("I think countries should have their own currency.");
            }
            else {
                    country.debateThings();
                }

            System.out.println();

        }

    }
}
