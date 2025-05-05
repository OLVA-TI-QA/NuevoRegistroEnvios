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
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths

// Abre el navegador y navega al mismo sitio web
WebUI.openBrowser('https://dev-registro-envios-mat-design.olvacourier.com/')

WebUI.maximizeWindow()

WebUI.delay(3)

// Toma una nueva captura de pantalla
WebUI.takeScreenshot('C:/Katalon_Images/principal/compararPrincipal_1.png')

// Lee los archivos de imagen en bytes
byte[] principal_1 = Files.readAllBytes(Paths.get('C:/Katalon_Images/principal/principal_1.png'))

byte[] comparar = Files.readAllBytes(Paths.get('C:/Katalon_Images/principal/compararPrincipal_1.png'))

// Compara las imágenes y lanza un error si son diferentes
assert principal_1 == comparar : '❌ ERROR: La interfaz ha cambiado. Las imágenes NO son iguales.'

println('✅ Las imágenes son IGUALES. Prueba exitosa.')

// Cierra el navegador
WebUI.closeBrowser()

