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

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/span_Seleccionar tipo de comprobante'), 
    'Seleccionar tipo de comprobante')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_BOLETA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/img_CONTINUAR_btn-icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Selecciona un tipo de documento'), 
    'Selecciona un tipo de documento.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOs')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '3', true)

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '002691903')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_EMAIL_inputCelularCliente'), '1')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese correctamente 9 dgitos'), 'Ingrese correctamente 9 dígitos.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_NOMBRES Y APELLIDOS_inputEmailCliente'), '1')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_El formato del email es invalido'), 
    'El formato del email es invalido')

