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

WebUI.callTestCase(findTestCase('1.PrincipalRE/1.Principal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  CE'), '1', true)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Escriba su primer apellido igual al d_19137b'), 'SARAVIA')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/div_Apellido ingresado incorrectamente'), 
    0)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Escriba su primer apellido igual al d_19137b'), 'DFGHJKL')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/div_Apellido ingresado incorrectamente'), 'Apellido ingresado incorrectamente.')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Escriba su primer apellido igual al d_19137b'), '123456789')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/small_Aceptar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/div_Apellido ingresado incorrectamente'), 
    0)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Escriba su primer apellido igual al d_19137b'), 'RIOS')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/small_Aceptar'))

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementClickable(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR'))

