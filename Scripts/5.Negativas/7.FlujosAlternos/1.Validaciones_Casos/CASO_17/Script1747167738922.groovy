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

WebUI.navigateToUrl('https://dev-olva-corp.olvacourier.com/OlvaERP-web/principal.xhtml')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'JSRIOS')

WebUI.setEncryptedText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'hjth/QklA0k=')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'LAURAVASQUEZ')

WebUI.setEncryptedText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'uXKCPWz3P6s=')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Maestros'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Host'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Configurar'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Host_frmConfHosthostComplete_input'), 
    'comas')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/li_COMASPC'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Grabar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/a_Jennifer Rios Alejos'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/a_Cerrar sesin'))

WebUI.setEncryptedText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'uXKCPWz3P6s=')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Atencin Cliente'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Venta'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Buscar Preventa'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), 
    '202506728042')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Seleccionar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Grabar (1)'))

WebUI.doubleClick(findTestObject('Object Repository/Negativos/validaciones_casos/td_90006636'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_compras por internet_input-status'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_N Tracking_frmConsultaEnviotxtRemito'), 
    '90006636')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

