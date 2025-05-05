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

WebUI.verifyElementNotChecked(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_Direccin de origenSelecciona tu ubicaci_e067db'), 
    0)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_Direccin de origenSelecciona tu ubicaci_e067db'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'), 
    '71735786')

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/h5_Validacin de Apellido'), 
    0)

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_Escriba su primer apellido igual al d_19137b'), 
    'rios')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/small_Aceptar'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_EMAIL_inputCelularCliente'), 
    '123456789')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/img_CONTINUAR_btn-icon'))

WebUI.verifyElementNotChecked(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_Datos de quin envaCompleta los datos de_8fb21f'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_SELECCIONE EL ORIGEN DE SU ENVO  LIM_c14459'), 
    '43', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/b_OLVA ALMACEN - AV. ARGENTINA 4458 - CALLAO'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/img_TiendasAgentes Olva_leaflet-marker-icon_4ea37c'), 
    0)

WebUI.closeBrowser()

