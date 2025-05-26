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
    '3', true)

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE DESTINODESTINO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    'SAN ISIDRO')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - SAN ISIDRO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    '')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'DFGH')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'SAN ISIDRO')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _27237c'), 
    '12345678900')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_CONTACTO_inputCelularConsignado2'), '987654321')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_PRUEBA SAC'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_38a46f'), 
    'miraflores 12')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AGREGAR ENVO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_PRUEBA SAC'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_AGREGAR ENVO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _3df7a4'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE DESTINODESTINO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.doubleClick(findTestObject('Object Repository/Negativos/validaciones_casos/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '277', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghj')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_lentes, etc'))

WebUI.doubleClick(findTestObject('Object Repository/Negativos/validaciones_casos/div_compras por internet_input-status'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_38a46f'), 
    'bagua bagua bagua')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_DIRECCIN EXACTA_inputReferenciaDestinoComp'), 
    'ghjk')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Hasta 3 KgEjemMochila, pelota,parlantes, etc'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

