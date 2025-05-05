import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.click(findTestObject('positivas/TipoEnvio/div_Pago en en banca mvil,bancos y banca po_e36115'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/TipoEnvio/button_IR A PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_IR A PAGAR'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/TipoEnvio/div_REGISTRO EXITOSO'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/positivas/TipoEnvio/div_Te esperamos en nuestras tiendasagentes_1eb82f'), 
    'Te esperamos en nuestras tiendas/agentes para recepcionar tus envíos.')

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_Descargar Rtulo'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_REGISTRAR NUEVO ENVO'))

