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

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/button_FACTURA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_TIPO DE DOCUMENTO  RUC'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'), 
    '20100686814')

WebUI.click(findTestObject('Object Repository/Negativos/Page_Registro de Envos/img_CONTINUAR_btn-icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Registro de Envos/div_Ingrese los 9 dgitos obligatorios'), 
    'Ingrese los 9 dígitos obligatorios.')

WebUI.click(findTestObject('Object Repository/Negativos/Page_Registro de Envos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/Page_Registro de Envos/input_EMAIL_inputCelularCliente'), '1234567')

WebUI.click(findTestObject('Object Repository/Negativos/Page_Registro de Envos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/Page_Registro de Envos/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/Page_Registro de Envos/div_Ingrese los 9 dgitos obligatorios'), 
    'Ingrese los 9 dígitos obligatorios.')

