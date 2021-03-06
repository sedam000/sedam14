package vvgtest.ja;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Zahtjevi implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("ZahtjevID")
   private Long id_zahtjeva;
   @org.kie.api.definition.type.Label("Naziv zahjeva")
   private java.lang.String naziv_zahtjeva;
   @org.kie.api.definition.type.Label("Kratki opis zahtjeva")
   private java.lang.String opis_zahtjeva;

   @org.kie.api.definition.type.Label("Opis poslovnih pravila")
   private java.lang.String korisnicka_specifikacija;

   @org.kie.api.definition.type.Label("Narucitelj")
   private java.lang.String narucitelj;

   @org.kie.api.definition.type.Label("kontakt_osoba")
   private java.lang.String kontakt_osoba;

   @org.kie.api.definition.type.Label("korisnik")
   private Korisnici id_korisnika;

   @org.kie.api.definition.type.Label("status zahtjeva")
   private vvgtest.ja.Statusi id_status;

   public Zahtjevi()
   {
   }

   public java.lang.String getNaziv_zahtjeva()
   {
      return this.naziv_zahtjeva;
   }

   public void setNaziv_zahtjeva(java.lang.String naziv_zahtjeva)
   {
      this.naziv_zahtjeva = naziv_zahtjeva;
   }

   public java.lang.String getOpis_zahtjeva()
   {
      return this.opis_zahtjeva;
   }

   public void setOpis_zahtjeva(java.lang.String opis_zahtjeva)
   {
      this.opis_zahtjeva = opis_zahtjeva;
   }

   public java.lang.String getKorisnicka_specifikacija()
   {
      return this.korisnicka_specifikacija;
   }

   public void setKorisnicka_specifikacija(
         java.lang.String korisnicka_specifikacija)
   {
      this.korisnicka_specifikacija = korisnicka_specifikacija;
   }

   public java.lang.String getNarucitelj()
   {
      return this.narucitelj;
   }

   public void setNarucitelj(java.lang.String narucitelj)
   {
      this.narucitelj = narucitelj;
   }

   public java.lang.String getKontakt_osoba()
   {
      return this.kontakt_osoba;
   }

   public void setKontakt_osoba(java.lang.String kontakt_osoba)
   {
      this.kontakt_osoba = kontakt_osoba;
   }

   public vvgtest.ja.Korisnici getId_korisnika()
   {
      return this.id_korisnika;
   }

   public void setId_korisnika(vvgtest.ja.Korisnici id_korisnika)
   {
      this.id_korisnika = id_korisnika;
   }

   public vvgtest.ja.Statusi getId_status()
   {
      return this.id_status;
   }

   public void setId_status(vvgtest.ja.Statusi id_status)
   {
      this.id_status = id_status;
   }

   public java.lang.Long getId_zahtjeva()
   {
      return this.id_zahtjeva;
   }

   public void setId_zahtjeva(java.lang.Long id_zahtjeva)
   {
      this.id_zahtjeva = id_zahtjeva;
   }

   public Zahtjevi(java.lang.Long id_zahtjeva, java.lang.String naziv_zahtjeva,
         java.lang.String opis_zahtjeva,
         java.lang.String korisnicka_specifikacija, java.lang.String narucitelj,
         java.lang.String kontakt_osoba, vvgtest.ja.Korisnici id_korisnika,
         vvgtest.ja.Statusi id_status)
   {
      this.id_zahtjeva = id_zahtjeva;
      this.naziv_zahtjeva = naziv_zahtjeva;
      this.opis_zahtjeva = opis_zahtjeva;
      this.korisnicka_specifikacija = korisnicka_specifikacija;
      this.narucitelj = narucitelj;
      this.kontakt_osoba = kontakt_osoba;
      this.id_korisnika = id_korisnika;
      this.id_status = id_status;
   }

}