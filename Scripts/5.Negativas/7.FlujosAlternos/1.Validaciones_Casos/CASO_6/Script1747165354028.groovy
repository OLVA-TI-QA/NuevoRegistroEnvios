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

WebUI.click(findTestObject('Object Repository/Negativos/valorado/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_Datos de quin envaCompleta los datos de_49ed04'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/valorado/select_TIPO DE DOCUMENTO  DNI  CE'), '3', 
    true)

WebUI.click(findTestObject('Object Repository/Negativos/valorado/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/valorado/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_INGRESE DESTINODESTINO'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/valorado/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 10000')

WebUI.click(findTestObject('Object Repository/Negativos/valorado/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/Negativos/valorado/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 'dfghj')

WebUI.click(findTestObject('Object Repository/Negativos/valorado/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/span_mercancias peligrosas_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/valorado/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'bagua dir prueba')

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/valorado/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/valorado/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/valorado/input_Completa los datos de la persona que _27237c'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_IR A PAGAR'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/div_Pago en banca mvil,'))

WebUI.click(findTestObject('Object Repository/Negativos/valorado/button_IR A PAGAR'))

