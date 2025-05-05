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

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOs')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_Aceptar'))

WebUI.click(findTestObject('Negativos/Page_Registro de Envos/CONTINUAR_origen'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_INGRESE ORIGEN ORIGEN'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOS')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_queenvias'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'ghjk')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_TipoArt'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_BAGUA CHICABAGUA - PJ ALFONSO UGARTE NR_fb4978'))

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '71735700')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '71735705')

WebUI.rightClick(findTestObject('Object Repository/Negativos/camposVacios/div_Consignado no encontradoOKNoCancel'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/h2_Consignado no encontrado'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/h2_Consignado no encontrado'), 'Consignado no encontrado')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Datos de quin recibeCompleta los datos _df3b2e'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese correctamente 9 dgitos'), 'Ingrese correctamente 9 dígitos.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '003680654')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/h2_Consignado no encontrado'), 'Consignado no encontrado')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese correctamente 9 dgitos'), 'Ingrese correctamente 9 dígitos.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '20100686515')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/h2_Consignado no encontrado'), 'Consignado no encontrado')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/input_NMERO DOCUMENTO_inputNombreCompletoCo_df80e8'))

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Este campo es obligatorio'), 'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/div_Ingrese correctamente 9 dgitos'), 'Ingrese correctamente 9 dígitos.')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_NMERO DOCUMENTO_inputNombreCompletoCo_df80e8'), 
    'sdfghjkjhgfdghjkljhgjjjjjjjjjfygiuhijdiawjdiwjnfiewnhfhnweufhnewfhwejhfncewhnfcihenicvnheiqvnuebnvuj')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_RAZN SOCIAL_inputCelularConsignado2'), '987654321')

WebUI.click(findTestObject('positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/td_sdfghjkjhgfdghjkljhgjjjjjjjjjfygiuhijdia_5cecf9'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _3df7a4'), 
    '20100686516')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/h2_Consignado no encontrado'), 'Consignado no encontrado')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _3df7a4'), 
    '71735765')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/h2_Consignado no encontrado'), 'Consignado no encontrado')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _3df7a4'), 
    '003680654')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/camposVacios/h2_Consignado no encontrado'), 'Consignado no encontrado')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_OK'))

