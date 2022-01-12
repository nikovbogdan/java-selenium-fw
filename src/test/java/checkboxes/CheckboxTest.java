package checkboxes;
import base.BaseTest;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {


    @Test
    public void testCheckbox() {
        var checkbox = homePage.clickCheckboxes();
        checkbox.markFirstCheckbox();
        checkbox.verifyFirstCheckboxIsSelected();
        checkbox.markSecondCheckbox();
        checkbox.verifySecondCheckboxIsSelected();

        checkbox.unmarkFirstCheckbox();
        checkbox.verifyFirstCheckboxIsNotSelected();
        checkbox.unmarkSecondCheckbox();
        checkbox.verifySecondCheckboxIsNotSelected();


    }
}
