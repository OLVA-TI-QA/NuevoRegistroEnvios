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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-registro-envios-mat-design.olvacourier.com/')

WebUI.verifyElementText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/h1_Qu deseas realizar hoy'), 
    '¿Qué deseas realizar hoy?')

WebUI.verifyElementText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/img_Qu deseas realizar hoy_img-fluid'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/h2_SI LLEGA A TUS MANOS ES, OLVA'), 
    'SI LLEGA A TUS MANOS ES, OLVA')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_REALIZAR UN ENVO'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_Direccin de origenSelecciona tu ubicaci_e067db'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_Direccin de origenSelecciona tu ubicaci_e067db'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'), 
    '71735786')

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/h5_Validacin de Apellido'), 
    0)

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_Escriba su primer apellido igual al d_19137b'), 
    'rios')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_EMAIL_inputCelularCliente'), 
    '123456789')

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'), 
    '003680378')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_EMAIL_inputCelularCliente'), 
    '123456789')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/img_CONTINUAR_btn-icon'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_Datos de quin envaCompleta los datos de_8fb21f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_SELECCIONE EL ORIGEN DE SU ENVO  LIM_c14459'), 
    '43', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/b_OLVA ALMACEN - AV. ARGENTINA 4458 - CALLAO'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/img_TiendasAgentes Olva_leaflet-marker-icon_4ea37c'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_SELECCIONE EL ORIGEN DE SU ENVO  LIM_c14459'), 
    '294', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_CA GUATEMALA NRO 161 URBANIZACION SAN F_2c1677'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_ICA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_SELECCIONE EL ORIGEN DE SU ENVO  LIM_c14459'), 
    '238', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/b_TRUJILLO - TIENDA ESPAA'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/div_TRUJILLO - TIENDA ESPAA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_SELECCIONE EL ORIGEN DE SU ENVO  LIM_c14459'), 
    '21', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/b_CHEPEN'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/button_FACTURA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/select_TIPO DE DOCUMENTO  RUC'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_FACTURA_inputNroDocumentoCliente'), 
    '20100686814')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/input_EMAIL_inputCelularCliente'), 
    '123456789')

WebUI.click(findTestObject('Object Repository/Positivas_Boleta/Page_Registro de Envos/img_CONTINUAR_btn-icon'))

