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

WebUI.openBrowser('https://www.linkedin.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/input_email'))

WebUI.setText(findTestObject('Login/input_email'), 'projetosdokatalon@gmail.com')

WebUI.click(findTestObject('Login/input_senha'))

WebUI.setText(findTestObject('Login/input_senha'), '@projetosdokatalon123')

WebUI.mouseOver(findTestObject('Login/button_entrar'))

WebUI.click(findTestObject('Login/button_entrar'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Home/Perfil/img_perfil'))

WebUI.click(findTestObject('Home/Perfil/img_perfil'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Home/Perfil/button_meu_perfil'))

WebUI.click(findTestObject('Home/Perfil/button_meu_perfil'))

WebUI.scrollToElement(findTestObject('Home/Perfil/1 - Sobre/div_sobre'), 0)

WebUI.verifyElementVisible(findTestObject('Home/Perfil/1 - Sobre/div_sobre'))

WebUI.verifyTextPresent('Sobre', true)

WebUI.mouseOver(findTestObject('Home/Perfil/1 - Sobre/button_editar_sobre'))

WebUI.click(findTestObject('Home/Perfil/1 - Sobre/button_editar_sobre'))

WebUI.click(findTestObject('Home/Perfil/1 - Sobre/textarea_sobre'))

WebUI.sendKeys(findTestObject('Home/Perfil/1 - Sobre/textarea_sobre'), Keys.chord(Keys.CLEAR))

