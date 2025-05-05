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

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'aramango')

WebUI.sendKeys(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/TipoEnvio/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Seleccione un tipo de artculo_inputVa_ff9093'), 'S/ 12')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 'fghjk')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/h2_Destino no Permitido'), 'Destino no Permitido')

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/div_Este destino no permite RECOJO EN TIEND_3c7c59'), 
    'Este destino no permite RECOJO EN TIENDA, por favor seleccione otro tipo de entrega')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_OK'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/h2_Destino no Permitido'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/div_Este destino no permite RECOJO EN TIEND_3c7c59'), 
    0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_OK'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/positivas/Sobres/input_Impresoras, laptops, consolas, etc_se_1be03f'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 'Aramango dir prueba')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'vgbhnj')

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Completa los datos de la persona que _27237c'), '71735786')

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1_2'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/div_Hasta 4 KgEjemPeluches, almohadas,lmpar_700831'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/td_Envo a Domicilio'), 'Envío a Domicilio')

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/td_AMAZONAS - BAGUA - ARAMANGO'), 'AMAZONAS - BAGUA - ARAMANGO')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/h2_Destino no Permitido'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/div_Este destino no permite RECOJO EN TIEND_3c7c59'), 
    0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_OK'))

WebUI.setText(findTestObject('positivas/Sobres/input_SELECCIONE EL DESTINO EDITAR'), 'Probar cambio direccion')

WebUI.setText(findTestObject('positivas/Sobres/input_DIRECCIN EXACTA_inputReferenciaEDITAR'), 'vgbhnj')

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(2)

WebUI.click(findTestObject('positivas/Sobres/td_Envo a Domicilio'))

WebUI.delay(2)

WebUI.click(findTestObject('positivas/Sobres/div_AMAZONAS - BAGUA - ARAMANGODESTINO'))

WebUI.setText(findTestObject('positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'AMAZONAS - BAGUA - BAGUA')

WebUI.sendKeys(findTestObject('positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('positivas/Sobres/input_SELECCIONE EL DESTINO EDITAR'), 'Probar cambio direccion')

WebUI.setText(findTestObject('positivas/Sobres/input_DIRECCIN EXACTA_inputReferenciaEDITAR'), 'vgbhnj')

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/td_Envo a Domicilio'), 'Envío a Domicilio')

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/td_AMAZONAS - BAGUA - ARAMANGO'), 'AMAZONAS - BAGUA - BAGUA')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_AGREGAR ENVO'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 0, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Completa los datos de la persona que _3df7a4'), '003680378')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_INGRESE DESTINODESTINO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'viru')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_LA LIBERTAD - VIRU - VIRU'))

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Seleccione un tipo de artculo_inputVa_ff9093'), 'S/ 12')

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 'fghj')

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/h2_Destino no Permitido'), 'Destino no Permitido')

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/div_Este destino no permite ENTREGA A DOMIC_c7183b'), 
    'Este destino no permite ENTREGA A DOMICILIO, por favor seleccione otro tipo de entrega')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_ENTREGA  A DOMICILIO'))

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/h2_Destino no Permitido'), 'Destino no Permitido')

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/div_Este destino no permite ENTREGA A DOMIC_c7183b'), 
    'Este destino no permite ENTREGA A DOMICILIO, por favor seleccione otro tipo de entrega')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('positivas/Sobres/div_VIRU - TIENDA VIRU - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.delay(2)

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

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/div_Te esperamos en nuestras tiendasagentes_1eb82f'), 
    'Te esperamos en nuestras tiendas/agentes para recepcionar tus envíos.')

