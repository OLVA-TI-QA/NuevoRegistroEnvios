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
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '002691903')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR'))

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - LA PECA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '529', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'gvbhnjk')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'la peca')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_DIRECCIN EXACTA_inputReferenciaDestino'), 'ghjk')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Selecciona un tipo de documento'), 
    'Selecciona un tipo de documento.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '71735785')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_APELLIDO MATERNO_inputCelularConsignado'), 
    '1')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese correctamente 9 dgitos'), 'Ingrese correctamente 9 dígitos.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Negativos/camposVacios/input_NOMBRES(S)_inputApePatConsignado'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Negativos/camposVacios/input_NMERO DOCUMENTO_inputNombreConsignado'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_APELLIDO MATERNO_inputCelularConsignado'), 
    '987654321')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_No s el peso de mi envo'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CALCULAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_ANCHO (cm)'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Clcula el peso de tu envo ingresando _53efce'), 
    '1')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_LARGO (cm)'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_ANCHO (cm)_inputLargo'), '1')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_LARGO (cm)_inputAlto'), '1')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CALCULAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingresar las medidas mnimas'), 'Ingresar las medidas mínimas.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Clcula el peso de tu envo ingresando _53efce'), 
    '101')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_ANCHO (cm)_inputLargo'), '102')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_LARGO (cm)_inputAlto'), '103')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CALCULAR'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ninguna dimensin puede superar 1 metro'), 
    'Ninguna dimensión puede superar 1 metro')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Clcula el peso de tu envo ingresando _53efce'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_ANCHO (cm)_inputLargo'), '12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_LARGO (cm)_inputAlto'), '14')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CALCULAR'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

