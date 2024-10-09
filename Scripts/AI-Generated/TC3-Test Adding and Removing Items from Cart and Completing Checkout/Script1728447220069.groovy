import internal.GlobalVariable
import truetest.common.fillCheckoutFormWithPersonalDetails
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on button OpenMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_OpenMenu'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button OpenMenu.png')

"Step 4: Click on link AllItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_AllItems'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link AllItems.png')

"Step 5: Click on link About"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_About'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link About.png')

"Step 6: Click on select object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/select_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on select object.png')

"Step 7: Click on link SauceLabsFleeceJacket -> Navigate to page '/inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_SauceLabsFleeceJacket'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link SauceLabsFleeceJacket - Navigate to page inventory-itemhtml.png')

"Step 8: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button AddToCart.png')

"Step 9: Click on button BackToProducts -> Navigate to page '/inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_BackToProducts'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button BackToProducts - Navigate to page inventoryhtml.png')

"Step 10: Click on link SauceLabsBoltTShirt -> Navigate to page '/inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_SauceLabsBoltTShirt'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on link SauceLabsBoltTShirt - Navigate to page inventory-itemhtml.png')

"Step 11: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button AddToCart.png')

"Step 12: Click on button BackToProducts -> Navigate to page '/inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_BackToProducts'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on button BackToProducts - Navigate to page inventoryhtml.png')

"Step 13: Click on button AddToCart3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_AddToCart3'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on button AddToCart3.png')

"Step 14: Click on select object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/select_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on select object.png')

"Step 15: Click on link object -> Navigate to page '/cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on link object - Navigate to page carthtml.png')

"Step 16: Click on button Remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_Remove'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on button Remove.png')

"Step 17: Click on button Remove2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_Remove2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on button Remove2.png')

"Step 18: Fill out checkout form with personal and postal details"

fillCheckoutFormWithPersonalDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 19: Click on button Finish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_Finish'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on button Finish - Navigate to page checkout-completehtml.png')

"Step 20: Click on button BackHome -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_BackHome'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on button BackHome - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Test Adding and Removing Items from Cart and Completing Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}