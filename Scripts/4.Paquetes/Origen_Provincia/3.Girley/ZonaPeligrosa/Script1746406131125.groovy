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

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'Piura')

WebUI.sendKeys(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 'Callao')

WebUI.sendKeys(findTestObject('Object Repository/positivas/Sobres/input_Ingresa el destino de tu envo_inputBu_d7b93a'), 
    Keys.chord(Keys.ENTER))

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

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 'jr ollanta 113, san luis')

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    0)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/div_Zona sin coberturaLa direccin ingresada_98e8b8'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/small_Zona sin cobertura'), 'Zona sin cobertura')

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/small_La direccin ingresada corresponde a u_3de242'), 
    'La dirección ingresada corresponde a una zona sin cobertura. Te recomendamos modificar la dirección o seleccionar la opción de recojo en tienda.')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_Editar direccin'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 'jr ollanta 114, san luis, lima, lima, per')

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    0)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/positivas/TipoEnvio/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/div_Zona sin coberturaLa direccin ingresada_98e8b8'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/positivas/Sobres/small_Zona sin cobertura'), 'Zona sin cobertura')

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_Cambiar tipo de entrega'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/positivas/Sobres/small_TiendasAgentes Olva'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_OLVA GAMARRA - JR. ANTONIO BAZO 1278LA _28d875'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/positivas/Sobres/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/positivas/Sobres/input_Completa los datos de la persona que _27237c'), '71735786')

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1_2'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/div_Hasta 5 KgEjemImpresoras, laptops,conso_6d2664'))

WebUI.delay(4)

WebUI.click(findTestObject('positivas/TipoEnvio/CONTINUAR_qnRecibe'))

WebUI.verifyElementText(findTestObject('positivas/Sobres/td_Recojo en Tienda'), 'Recojo en Tienda')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/positivas/Sobres/button_IR A PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/positivas/Sobres/button_IR A PAGAR'))

