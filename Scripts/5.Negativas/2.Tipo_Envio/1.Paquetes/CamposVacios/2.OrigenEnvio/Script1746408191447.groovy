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

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_FACTURA'))

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '12345678900')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/h2_Contribuyente no ACTIVO'), 'Contribuyente no ACTIVO')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '20100686815')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '20100686814')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_CELULAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_EMAIL_inputCelularCliente'), '000000000')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese correctamente 9 dgitos'), 'Ingrese correctamente 9 dígitos.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_EMAIL'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_EMAIL_inputCelularCliente'), '987654321')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_NOMBRES Y APELLIDOS_inputEmailCliente'), 'lauravasquez189.0@')

WebUI.rightClick(findTestObject('Object Repository/Negativos/camposVacios/div_El formato del email es invalido'))

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_El formato del email es invalido'), 
    'El formato del email es invalido')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_NOMBRES Y APELLIDOS_inputEmailCliente'), 'lauravasquez189.0@gmail.com')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione el origen'), 'Seleccione el origen')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Seleccione el destino'), 'Seleccione el destino')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Acepte los terminos y condiciones'), 
    'Acepte los terminos y condiciones.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE DESTINODESTINO'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

