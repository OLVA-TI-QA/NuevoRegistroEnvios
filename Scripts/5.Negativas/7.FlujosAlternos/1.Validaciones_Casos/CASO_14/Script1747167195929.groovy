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

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Cancelar'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOS')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/validaciones_casos/input_Escriba su primer apellido igual al d_19137b'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_INGRESE ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'ATE')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - ATE'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_SOBRE'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 123')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'FGHJ')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_OLVA REAL PLAZA PURUCHUCOATE - AV JAVIE_119dc0'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _27237c'), 
    '003680378')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_LAURA VASQUEZ MOGOLLN'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _3df7a4'), 
    '002691903')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_YASIBIT ROYELI MOGOLLN BRICEO'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _3df7a4'), 
    '')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - ATEDESTINO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'BARRANCO')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - BARRANCO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/input_RECOJO ENTIENDAAGENTE_selectDestinoTi_16e699'), 
    '')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AGENTE OLVA BARRANCO ESPACIO CONCEPTO M_6b8b7b'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/td_LIMA - LIMA - BARRANCO'), 'LIMA - LIMA - BARRANCO')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/td_Recojo en Tienda'), 'Recojo en Tienda')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Genera una clave y comprtela con la p_371c39'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Genera una clave y comprtela con la p_054be0'), 
    '4')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/img_CONTINUAR_btn-icon'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

