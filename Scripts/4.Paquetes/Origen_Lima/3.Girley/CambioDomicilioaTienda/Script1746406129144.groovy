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

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_BOLETA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  CE'), '3', true)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_LIMA'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'lince')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_LIMA - LIMA - LINCE'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Seleccione un tipo de artculo_inputVa_ff9093'), 'S/ 12')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 'fghjk')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/positivas/Sobres/input_Impresoras, laptops, consolas, etc_se_1be03f'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 'avenida comandante espinar 659, miraflores, lima, lima')

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    0)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Completa los datos de la persona que _27237c'), '71735786')

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1_2'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/div_Hasta 1 KgEjemRopa, bisutera, reloj,len_7246c3'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/td_Recojo en Tienda'), 'Recojo en Tienda')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/small_DESTINO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'san borja')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_LIMA - LIMA - SAN BORJA'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '167', true)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Seleccione un tipo de artculo_inputVa_ff9093'), 'S/ 123')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 'fghjk')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'), 0)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/positivas/Sobres/input_Impresoras, laptops, consolas, etc_se_1be03f'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 'av aviacion 3532, san borja, lima, lima per')

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('positivas/TipoEnvio/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Completa los datos de la persona que _27237c'), '12345678900')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_CELULAR'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_RAZN SOCIAL_inputCelularConsignado2'), '987654321')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_Hasta 2 KgEjemAudifonos, zapatillas,gor_28810e'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/input_Crear una clave de 4 dgitos para reco_4d1f4d'), 
    0)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Crear una clave de 4 dgitos para reco_4d1f4d'), '1')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Crear una clave de 4 dgitos para reco_e7fe6c'), '2')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Crear una clave de 4 dgitos para reco_b967b3'), '3')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Crear una clave de 4 dgitos para reco_6cbaf2'), '4')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_IR A PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_IR A PAGAR'))

