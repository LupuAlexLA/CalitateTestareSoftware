package testareCinema;

import org. junit.experimental. categories. Categories. IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners. Suite. SuiteClasses;
import org.junit.experimental.categories.Categories;

@RunWith(Categories.class)
@IncludeCategory (TesteAchizitie.class)
@SuiteClasses ({ TestCardFidelitate.class})
public class SuitaTesteAchizitie {

}
