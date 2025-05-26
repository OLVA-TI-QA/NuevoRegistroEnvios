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

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_FACTURA_inputNroDocumentoCliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Escriba su primer apellido igual al d_19137b'), 
    'RIOS')

WebUI.sendKeys(findTestObject('Object Repository/Negativos/validaciones_casos/input_Escriba su primer apellido igual al d_19137b'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_INGRESE ORIGEN ORIGEN'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_PAQUETE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE ARTCULO  ACCESORIOS Y EQUIPO_f94c1d'), 
    '273', true)

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 1234')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_ESPECIFICAR ARTCULO_slider round'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_ESPECIFICAR ARTCULO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'fghjkl')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'bagua dir prueba')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _27237c'), 
    '71735785')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_No s el peso de mi envo'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Clcula el peso de tu envo ingresando _53efce'), 
    '12')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_LARGO (cm)'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_ANCHO (cm)_inputLargo'), '13')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_LARGO (cm)_inputAlto'), '14')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CALCULAR'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Cancelar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Seleccione una cantidad de Folios'), 
    'Seleccione una cantidad de Folios.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Seleccione el tipo de Retorno'), 
    'Seleccione el tipo de Retorno.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_INGRESE EL DESTINO DEL CARGO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Este campo es obligatorio'), 
    'Este campo es obligatorio.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Seleccione una oficina'), 'Seleccione una oficina.')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Ingrese el destino correctamente'), 
    'Ingrese el destino correctamente.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Este campo es obligatorio'), 
    'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'lince')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - LINCE'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'calle de las bellas artes 122')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_JENNIFER RIOS ALEJOS'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_EDITAR'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'av aviacion 3532')

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_SELECCIONE TIENDA SAN BORJA - AV AVI_f51595'), 
    '339', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AGREGAR ENVO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_TIPO DE DOCUMENTO  DNI  RUC  C.E_1'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_NMERO DOCUMENTO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Completa los datos de la persona que _3df7a4'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_DESTINO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_AMAZONAS - BAGUA - LA PECA'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_SOBRE'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Seleccione un tipo de artculo_inputVa_ff9093'), 
    'S/ 123')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_VALOR DEL CONTENIDO_inputDetalleArticulo'), 
    'dfghj')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Cancelar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Seleccione el tipo de Retorno'), 
    'Seleccione el tipo de Retorno.')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Ingrese el destino correctamente'), 
    'Ingrese el destino correctamente.')

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/div_Este campo es obligatorio'), 
    'Este campo es obligatorio.')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'ica')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - CHOSICA'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'chosica ')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/span_Realizan el pago al recoger el envo, e_879eb4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_FOLIOS  1 FOLIO  2 FOLIOS  3 FOLIOS'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_INGRESE EL DESTINO DEL CARGO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Impresoras, laptops, consolas, etc_se_20c89d'), 
    'ate')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - ATE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Negativos/validaciones_casos/select_SELECCIONE TIENDA ATE - AV JAVIER PR_1a42df'), 
    '510', true)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIOEjemImpresoras, lap_415985'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_INGRESE EL DESTINO DEL CARGO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'lince')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - LINCE'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'calle san juan')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTEEjemImpresoras, _f96a59'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_A dnde retornamos el cargo'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_ENTREGA  A DOMICILIO'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/label_INGRESE EL DESTINO DEL CARGO'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Impresoras, laptops, consolas, etc_se_1be03f'), 
    'lince')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_LIMA - LIMA - LINCE'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_b5b43f'), 
    'calle santa ')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/small_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Negativos/validaciones_casos/input_Quiero retorno de cargo_input-dimen n_26be98'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_RECOJO EN  TIENDAAGENTE289 tiendas a ni_de1bb7'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_OK'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_ENTREGA  A DOMICILIORecibe tus envios e_e266cc'))

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_SELECCIONE EL DESTINO DE SU ENVO_inpu_38a46f'), 
    'la peca dir prueba')

WebUI.setText(findTestObject('Object Repository/Negativos/validaciones_casos/input_DIRECCIN EXACTA_inputReferenciaDestinoComp'), 
    'ghjk')

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_JENNIFER RIOS ALEJOS'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/td_COLEGIO  DE BIOLOGOS DEL PERU'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_CONTINUAR_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER_1'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_VOLVER'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/div_Pago en banca mvil,bancos y banca por internet'))

WebUI.click(findTestObject('Object Repository/Negativos/validaciones_casos/button_IR A PAGAR'))

