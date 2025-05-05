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

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_FACTURA_inputNroDocumentoCliente'), '003680378')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/small_ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_SOBRE'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_VALOR DEL CONTENIDO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 12')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fgh')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Lunes - Viernes 0800 - 1800'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/camposVacios/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Completa los datos de la persona que _27237c'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_CONTINUAR_1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_4d1f4d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_e7fe6c'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_b967b3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_Crear una clave de 4 dgitos para reco_6cbaf2'), 
    '4')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_Tarjeta de crditodbito,billeteras electrnicas'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_IR A PAGAR'))

WebUI.delay(4)

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/Negativos/camposVacios/i'), 0)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/i'))

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_Continuar (1)'))

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_number'), '4111')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_number'), '1111')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_number'), '1111')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_number'), '1111')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/div_compras por internet_input-status'))

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_expiry'), '12')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_expiry'), '25')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_cvc'), '111')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_name'), 'fghj')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_lastname'), 'fdgvnhj')

WebUI.setText(findTestObject('Object Repository/Negativos/camposVacios/input_compras por internet_email'), 'sdfgh@gmail.com')

WebUI.click(findTestObject('Object Repository/Negativos/camposVacios/button_Pagar S 14.50'))

