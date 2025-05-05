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

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '1234567')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '00000000')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Cancelar'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '71735700')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_APELLIDO MATERNO_inputCelularClienteCrear'), 
    '12345')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_APELLIDO MATERNO_inputCelularClienteCrear'), 
    '000000000')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/img_CONTINUAR_btn-icon'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_GUARDAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_CELULAR_inputEmailClienteCrear'), 'dfghj')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_GUARDAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_CELULAR_inputEmailClienteCrear'), ' meeting.olva.ti@gmail.com')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/html_Registro de Envos          root--swal2_f3f684'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_CELULAR_inputEmailClienteCrear'), ' meeting.olva.ti@gmail.com')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_GUARDAR'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_GUARDAR'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/input_CELULAR_inputEmailClienteCrear'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_CELULAR_inputEmailClienteCrear'), 'meeting.olva.ti@gmail.com')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_GUARDAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_EMAIL_inputCelularCliente'), '987654321')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

