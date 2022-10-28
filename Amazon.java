class Amazon
{
public void LoginScriptTest()
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oneplus mobiles");
driver.findElement(By.xpath("//input[@type='submit']")).click();

List<WebElement> links=  driver.findElements(By.xpath("//a"));
int count = links.size();
System.out.println(count);
for(int i =0; i<count; i++)
{
WebElement we = links.get(i);
String text = we.getText();
System.out.println(text);
}
driver.findElement(By.xpath("//span[.='OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage)']")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0, 500)","");
driver.findElement(By.id("add-to-cart-button")).click();
driver.findElement(By.xpath("(//input[@type='submit'])")).click();
Select sel = new Select("Qty:");
sel.selectByIndex(2);
driver.findElement(By.xpath("//input[@value='Delete'])")).click();
driver.close();
}
}