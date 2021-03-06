package vvgtest.ja;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Analiza implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("AnalizaID")
   private java.lang.Long id_analize;
   @org.kie.api.definition.type.Label("OznakaUC")
   private java.lang.String oznaka_UC;

   @org.kie.api.definition.type.Label("naziv UC")
   private java.lang.String naziv_UC;

   @org.kie.api.definition.type.Label("opisivanje poslovnih pravila")
   private java.lang.String opis_uc;

   @org.kie.api.definition.type.Label("ZahtjevID")
   private Zahtjevi id_zahtjeva;

   @org.kie.api.definition.type.Label("Narucitelj")
   private java.lang.String narucitelj;

   @org.kie.api.definition.type.Label("Korisnik koji unosi podatke")
   private Korisnici id_korisnika;

   @org.kie.api.definition.type.Label("status analize")
   private vvgtest.ja.Statusi id_status;

   @org.kie.api.definition.type.Label("Preuzimanje zahtjeva")
   private String zahtjev_preuzet;

   public Analiza()
   {
   }

   public java.lang.Long getId_analize()
   {
      return this.id_analize;
   }

   public void setId_analize(java.lang.Long id_analize)
   {
      this.id_analize = id_analize;
   }

   public java.lang.String getOznaka_UC()
   {
      return this.oznaka_UC;
   }

   public void setOznaka_UC(java.lang.String oznaka_UC)
   {
      this.oznaka_UC = oznaka_UC;
   }

   public java.lang.String getNaziv_UC()
   {
      return this.naziv_UC;
   }

   public void setNaziv_UC(java.lang.String naziv_UC)
   {
      this.naziv_UC = naziv_UC;
   }

   public java.lang.String getOpis_uc()
   {
      return this.opis_uc;
   }

   public void setOpis_uc(java.lang.String opis_uc)
   {
      this.opis_uc = opis_uc;
   }

   public java.lang.String getNarucitelj()
   {
      return this.narucitelj;
   }

   public void setNarucitelj(java.lang.String narucitelj)
   {
      this.narucitelj = narucitelj;
   }

   public vvgtest.ja.Korisnici getId_korisnika()
   {
      return this.id_korisnika;
   }

   public void setId_korisnika(vvgtest.ja.Korisnici id_korisnika)
   {
      this.id_korisnika = id_korisnika;
   }

   public vvgtest.ja.Zahtjevi getId_zahtjeva()
   {
      return this.id_zahtjeva;
   }

   public void setId_zahtjeva(vvgtest.ja.Zahtjevi id_zahtjeva)
   {
      this.id_zahtjeva = id_zahtjeva;
   }

   public vvgtest.ja.Statusi getId_status()
   {
      return this.id_status;
   }

   public void setId_status(vvgtest.ja.Statusi id_status)
   {
      this.id_status = id_status;
   }

   public java.lang.String getZahtjev_preuzet()
   {
      return this.zahtjev_preuzet;
   }

   public void setZahtjev_preuzet(java.lang.String zahtjev_preuzet)
   {
      this.zahtjev_preuzet = zahtjev_preuzet;
   }

   public Analiza(java.lang.Long id_analize, java.lang.String oznaka_UC,
         java.lang.String naziv_UC, java.lang.String opis_uc,
         vvgtest.ja.Zahtjevi id_zahtjeva, java.lang.String narucitelj,
         vvgtest.ja.Korisnici id_korisnika, vvgtest.ja.Statusi id_status,
         java.lang.String zahtjev_preuzet)
   {
      this.id_analize = id_analize;
      this.oznaka_UC = oznaka_UC;
      this.naziv_UC = naziv_UC;
      this.opis_uc = opis_uc;
      this.id_zahtjeva = id_zahtjeva;
      this.narucitelj = narucitelj;
      this.id_korisnika = id_korisnika;
      this.id_status = id_status;
      this.zahtjev_preuzet = zahtjev_preuzet;
   }

}