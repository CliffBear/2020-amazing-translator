package nz.ac.eit.amazingtranslator;

import org.junit.Assert;
import org.junit.Test;

public class TranslationDictionariesTest {
    @Test
    public void getTranslation_12InFrench_ReturnsDouze(){
        TranslationDictionaries dictionaries = new TranslationDictionaries();
        dictionaries.initializeDictionaries();
        try {
            Assert.assertEquals("12 in French should be Douze","Douze", dictionaries.getTranslation(12,1));
        } catch (LanguageNotAvailableException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have an available translation!");
        }
    }
    @Test (expected = LanguageNotAvailableException.class)
    public void getTranslation_12WithUnsupportedLanguage_ThrowsLanguageUnavailableException() throws LanguageNotAvailableException{
        TranslationDictionaries dictionaries = new TranslationDictionaries();
        dictionaries.initializeDictionaries();
        try {
            Assert.assertEquals("12 in French should be Douze","Douze", dictionaries.getTranslation(12,4));
            Assert.fail("It should fail with an unsupported language");
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have an available translation!");
        }
    }
    @Test (expected = NumberOutOfRangeException.class)
    public void getTranslation_UnsupportedNumber31InFrench_ThrowsNumberOutOfRangeException() throws NumberOutOfRangeException{
        TranslationDictionaries dictionaries = new TranslationDictionaries();
        dictionaries.initializeDictionaries();
        try {
            Assert.assertEquals("12 in French should be Douze","Douze", dictionaries.getTranslation(31,1));
            Assert.fail("It should fail with an unsupported number");
        } catch (LanguageNotAvailableException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have an available translation!");
        }
    }
    @Test (expected = NumberOutOfRangeException.class)
    public void getTranslation_UnsupportedNumber0InFrench_ThrowsNumberOutOfRangeException() throws NumberOutOfRangeException{
        TranslationDictionaries dictionaries = new TranslationDictionaries();
        dictionaries.initializeDictionaries();
        try {
            Assert.assertEquals("12 in French should be Douze","Douze", dictionaries.getTranslation(0,1));
            Assert.fail("It should fail with an unsupported number");
        } catch (LanguageNotAvailableException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have an available translation!");
        }
    }
}
