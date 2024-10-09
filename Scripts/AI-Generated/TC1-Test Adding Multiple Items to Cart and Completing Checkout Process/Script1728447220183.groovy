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

"Step 3: Click on select object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/select_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on select object.png')

"Step 4: Click on select object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/select_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on select object.png')

"Step 5: Click on link SauceLabsFleeceJacket -> Navigate to page '/inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_SauceLabsFleeceJacket'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link SauceLabsFleeceJacket - Navigate to page inventory-itemhtml.png')

"Step 6: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button AddToCart.png')

"Step 7: Click on button BackToProducts -> Navigate to page '/inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/button_BackToProducts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button BackToProducts - Navigate to page inventoryhtml.png')

"Step 8: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button AddToCart.png')

"Step 9: Click on link SauceLabsBikeLight -> Navigate to page '/inventory-item.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_SauceLabsBikeLight'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link SauceLabsBikeLight - Navigate to page inventory-itemhtml.png')

"Step 10: Click on link object -> Navigate to page '/cart.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_item_html/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link object - Navigate to page carthtml.png')

"Step 11: Click on button ContinueShopping -> Navigate to page '/inventory.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_ContinueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button ContinueShopping - Navigate to page inventoryhtml.png')

"Step 12: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link object.png')

"Step 13: Fill out checkout form with personal and postal details"

fillCheckoutFormWithPersonalDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on button Finish -> Navigate to page '/checkout-complete.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-two.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_two_html/button_Finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button Finish - Navigate to page checkout-completehtml.png')

"Step 15: Click on button BackHome -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-complete.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_complete_html/button_BackHome'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button BackHome - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test Adding Multiple Items to Cart and Completing Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}