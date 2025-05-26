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

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_OLVA_cdk-overlay-backdrop cdk-overlay-d_db73cd'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_REALIZAR UN ENVO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  CE'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/img_CONTINUAR_btn-icon ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/validaciones_casos/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '71', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'DFGHJ')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_BAGUA CHICA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _27237c'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Hasta 5 KgEjemImpresoras, laptops,conso_6d2664'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_KATY RIOS ALEJOS'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/td_Recojo en Tienda'), 'Recojo en Tienda')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_KATY RIOS ALEJOS'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_No s el peso de mi envo'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Clcula el peso de tu envo ingresando _53efce'), 
    '99')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_LARGO (cm)'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_ANCHO (cm)_inputLargo'), '99')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_ALTO (cm)'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_LARGO (cm)_inputAlto'), '99')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CALCULAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_ENTREGA  A DOMICILIO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_38a46f'), 
    'bagua direccion prueba')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_DIRECCIN EXACTA_inputReferenciaDestinoComp'), 
    'fghj')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/td_Envo a Domicilio'), 'Envío a Domicilio')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_KATY RIOS ALEJOS'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/small_Hasta 162 Kg'), 'Hasta 162 Kg')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    '')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_El valor es entre 1 y 10000'), 
    'El valor es entre 1 y 10000.')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Este campo es obligatorio'), 
    'Este campo es obligatorio.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Selecciona un articulo'), 'Selecciona un articulo.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '688', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'frghj')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_BAGUA CHICABAGUA - PJ ALFONSO UGARTE NR_fb4978'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/td_Recojo en Tienda'), 'Recojo en Tienda')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Genera una clave y comprtela con la p_371c39'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Genera una clave y comprtela con la p_054be0'), 
    '4')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

