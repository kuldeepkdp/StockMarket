package kdp.StockMarket;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CandleStickAnalysisTest {
	
	
	   @Test
	    public void analyseMonthViewChart() throws InterruptedException
	    {
		   List<String> symbol = new ArrayList();
			
			
			
			
			
		    symbol.add("BSE:PERMAGN");
			symbol.add("BSE:JYOTIRES");
			symbol.add("BSE:PRAVEG");
			symbol.add("BSE:YASHO");
			symbol.add("BSE:EKI");
			symbol.add("BSE:PROTEAN");
			symbol.add("NSE:AARTIPHARM");
			symbol.add("NSE:ABFRL");
			symbol.add("NSE:ACE");
			symbol.add("NSE:ADANIENT");
			symbol.add("NSE:ADANIGREEN");
			symbol.add("NSE:ADANIPORTS");
			symbol.add("NSE:AETHER");
			symbol.add("NSE:AFFLE");
			symbol.add("NSE:ALKEM");
			symbol.add("NSE:ALKYLAMINE");
			symbol.add("NSE:ALLCARGO");
			symbol.add("NSE:AMARAJABAT");
			symbol.add("NSE:AMBER");
			symbol.add("NSE:AMBUJACEM");
			symbol.add("NSE:AMIORG");
			symbol.add("NSE:AMRUTANJAN");
			symbol.add("NSE:ANGELONE");
			symbol.add("NSE:APARINDS");
			symbol.add("NSE:APCOTEXIND");
			symbol.add("NSE:APLAPOLLO");
			symbol.add("NSE:APOLLOHOSP");
			symbol.add("NSE:ARROWGREEN");
			symbol.add("NSE:ASIANPAINT");
			symbol.add("NSE:ASTEC");
			symbol.add("NSE:ASTRAL");
			symbol.add("NSE:ATGL");
			symbol.add("NSE:AWHCL");
			symbol.add("NSE:AWL");
			symbol.add("NSE:AZAD");
			symbol.add("NSE:BAJAJ_AUTO");
			symbol.add("NSE:BAJAJHCARE");
			symbol.add("NSE:BAJFINANCE");
			symbol.add("NSE:BALAMINES");
			symbol.add("NSE:BALKRISIND");
			symbol.add("NSE:BALRAMCHIN");
			symbol.add("NSE:BASF");
			symbol.add("NSE:BCLIND");
			symbol.add("NSE:BEL");
			symbol.add("NSE:BECTORFOOD");
			symbol.add("NSE:BERGEPAINT");
			symbol.add("NSE:BHARTIARTL");
			symbol.add("NSE:BIKAJI");
			symbol.add("NSE:BOROLTD");
			symbol.add("NSE:BORORENEW");
			symbol.add("NSE:BSE");
			symbol.add("NSE:BSOFT");
			symbol.add("NSE:CAMPUS");
			symbol.add("NSE:CAMS");
			symbol.add("NSE:CAPLIPOINT");
			symbol.add("NSE:CARBORUNIV");
			symbol.add("NSE:CARYSIL");
			symbol.add("NSE:CCL");
			symbol.add("NSE:CDSL");
			symbol.add("NSE:CELLO");
			symbol.add("NSE:CENTURYPLY");
			symbol.add("NSE:CIPLA");
			symbol.add("NSE:CLEAN");
			symbol.add("NSE:COCHINSHIP");
			symbol.add("NSE:COFORGE");
			symbol.add("NSE:COLPAL");
			symbol.add("NSE:CONCOR");
			symbol.add("NSE:CONFIPET");
			symbol.add("NSE:CONTROLPR");
			symbol.add("NSE:COROMANDEL");
			symbol.add("NSE:CRAFTSMAN");
			symbol.add("NSE:CRISIL");
			symbol.add("NSE:CUMMINSIND");
			symbol.add("NSE:CYIENT");
			symbol.add("NSE:CYIENTDLM");
			symbol.add("NSE:DABUR");
			symbol.add("NSE:DALMIASUG");
			symbol.add("NSE:DATAPATTNS");
			symbol.add("NSE:DEEPAKFERT");
			symbol.add("NSE:DEEPAKNTR");
			symbol.add("NSE:DENORA");
			symbol.add("NSE:DIVISLAB");
			symbol.add("NSE:DIXON");
			symbol.add("NSE:DMART");
			symbol.add("NSE:DODLA");
			symbol.add("NSE:DOMS");
			symbol.add("NSE:DREAMFOLKS");
			symbol.add("NSE:DWARKESH");
			symbol.add("NSE:EASEMYTRIP");
			symbol.add("NSE:EIDPARRY");
			symbol.add("NSE:EMUDHRA");
			symbol.add("NSE:ENGINERSIN");
			symbol.add("NSE:ESABINDIA");
			symbol.add("NSE:EXIDEIND");
			symbol.add("NSE:FCL");
			symbol.add("NSE:FEDERALBNK");
			symbol.add("NSE:FINEORG");
			symbol.add("NSE:FLUOROCHEM");
			symbol.add("NSE:FSL");
			symbol.add("NSE:GAEL");
			symbol.add("NSE:GAIL");
			symbol.add("NSE:GANECOS");
			symbol.add("NSE:GARFIBRES");
			symbol.add("NSE:GLAND");
			symbol.add("NSE:GLOBAL");
			symbol.add("NSE:GODREJAGRO");
			symbol.add("NSE:GOKEX");
			symbol.add("NSE:GOLDIAM");
			symbol.add("NSE:GRANULES");
			symbol.add("NSE:GRAVITA");
			symbol.add("NSE:GREENPANEL");
			symbol.add("NSE:GRINDWELL");
			symbol.add("NSE:GUJGASLTD");
			symbol.add("NSE:HAL");
			symbol.add("NSE:HAPPSTMNDS");
			symbol.add("NSE:HARSHA");
			symbol.add("NSE:HATSUN");
			symbol.add("NSE:HAVELLS");
			symbol.add("NSE:HBLPOWER");
			symbol.add("NSE:HCG");
			symbol.add("NSE:HCLTECH");
			symbol.add("NSE:HDFCBANK");
			symbol.add("NSE:HEROMOTOCO");
			symbol.add("NSE:HFCL");
			symbol.add("NSE:HINDALCO");
			symbol.add("NSE:HINDUNILVR");
			symbol.add("NSE:HINDWAREAP");
			symbol.add("NSE:HINDZINC");
			symbol.add("NSE:HNDFDS");
			symbol.add("NSE:HSCL");
			symbol.add("NSE:HUDCO");
			symbol.add("NSE:ICEMAKE");
			symbol.add("NSE:ICICIBANK");
			symbol.add("NSE:ICICIGI");
			symbol.add("NSE:ICRA");
			symbol.add("NSE:IDEAFORGE");
			symbol.add("NSE:IDFCFIRSTB");
			symbol.add("NSE:IEX");
			symbol.add("NSE:INDIAMART");
			symbol.add("NSE:INDOCO");
			symbol.add("NSE:INFIBEAM");
			symbol.add("NSE:INFY");
			symbol.add("NSE:INOXINDIA");
			symbol.add("NSE:IOC");
			symbol.add("NSE:IONEXCHANG");
			symbol.add("NSE:IPCALAB");
			symbol.add("NSE:IRCTC");
			symbol.add("NSE:IREDA");
			symbol.add("NSE:IRFC");
			symbol.add("NSE:ISEC");
			symbol.add("NSE:ITC");
			symbol.add("NSE:JBCHEPHARM");
			symbol.add("NSE:JBMA");
			symbol.add("NSE:JIOFIN");
			symbol.add("NSE:JLHL");
			symbol.add("NSE:JSWENERGY");
			symbol.add("NSE:JSWINFRA");
			symbol.add("NSE:JUBLFOOD");
			symbol.add("NSE:JUBLINGREA");
			symbol.add("NSE:KABRAEXTRU");
			symbol.add("NSE:KAJARIACER");
			symbol.add("NSE:KAYNES");
			symbol.add("NSE:KEI");
			symbol.add("NSE:KIMS");
			symbol.add("NSE:KNRCON");
			symbol.add("NSE:KOTAKBANK");
			symbol.add("NSE:KPITTECH");
			symbol.add("NSE:KPRMILL");
			symbol.add("NSE:LALPATHLAB");
			symbol.add("NSE:LAURUSLABS");
			symbol.add("NSE:LICI");
			symbol.add("NSE:LINDEINDIA");
			symbol.add("NSE:LT");
			symbol.add("NSE:LTIM");
			symbol.add("NSE:LTTS");
			symbol.add("NSE:LUXIND");
			symbol.add("NSE:LXCHEM");
			symbol.add("NSE:M_M");
			symbol.add("NSE:MANALIPETC");
			symbol.add("NSE:MANKIND");
			symbol.add("NSE:MANYAVAR");
			symbol.add("NSE:MAPMYINDIA");
			symbol.add("NSE:MARICO");
			symbol.add("NSE:MASTEK");
			symbol.add("NSE:MAXHEALTH");
			symbol.add("NSE:MAZDOCK");
			symbol.add("NSE:MCDOWELL_N");
			symbol.add("NSE:MCX");
			symbol.add("NSE:MEDPLUS");
			symbol.add("NSE:METROBRAND");
			symbol.add("NSE:METROPOLIS");
			symbol.add("NSE:MIDHANI");
			symbol.add("NSE:MIRZAINT");
			symbol.add("NSE:MOLDTKPAC");
			symbol.add("NSE:MPHASIS");
			symbol.add("NSE:MSTCLTD");
			symbol.add("NSE:MTARTECH");
			symbol.add("NSE:MUTHOOTFIN");
			symbol.add("NSE:NATIONALUM");
			symbol.add("NSE:NAUKRI");
			symbol.add("NSE:NAVINFLUOR");
			symbol.add("NSE:NAZARA");
			symbol.add("NSE:NELCO");
			symbol.add("NSE:NEOGEN");
			symbol.add("NSE:NETWEB");
			symbol.add("NSE:NEWGEN");
			symbol.add("NSE:NH");
			symbol.add("NSE:NHPC");
			symbol.add("NSE:NIITLTD");
			symbol.add("NSE:NMDC");
			symbol.add("NSE:NTPC");
			symbol.add("NSE:NYKAA");
			symbol.add("NSE:OFSS");
			symbol.add("NSE:OIL");
			symbol.add("NSE:OLECTRA");
			symbol.add("NSE:ONGC");
			symbol.add("NSE:ORIENTELEC");
			symbol.add("NSE:PAKKA");
			symbol.add("NSE:PANAMAPET");
			symbol.add("NSE:PARAS");
			symbol.add("NSE:PATANJALI");
			symbol.add("NSE:PERSISTENT");
			symbol.add("NSE:PFC");
			symbol.add("NSE:PIDILITIND");
			symbol.add("NSE:PIIND");
			symbol.add("NSE:POLYCAB");
			symbol.add("NSE:POLYMED");
			symbol.add("NSE:POLYPLEX");
			symbol.add("NSE:POWERGRID");
			symbol.add("NSE:POWERINDIA");
			symbol.add("NSE:PPLPHARMA");
			symbol.add("NSE:PRAJIND");
			symbol.add("NSE:PRICOLLTD");
			symbol.add("NSE:PRINCEPIPE");
			symbol.add("NSE:RADICO");
			symbol.add("NSE:RAINBOW");
			symbol.add("NSE:RAJRATAN");
			symbol.add("NSE:RCF");
			symbol.add("NSE:REDINGTON");
			symbol.add("NSE:REDTAPE");
			symbol.add("NSE:RELAXO");
			symbol.add("NSE:RELIANCE");
			symbol.add("NSE:RHIM");
			symbol.add("NSE:RITES");
			symbol.add("NSE:ROLEXRINGS");
			symbol.add("NSE:ROSSARI");
			symbol.add("NSE:ROUTE");
			symbol.add("NSE:RUPA");
			symbol.add("NSE:RVNL");
			symbol.add("NSE:SAREGAMA");
			symbol.add("NSE:SBCL");
			symbol.add("NSE:SBILIFE");
			symbol.add("NSE:SBIN");
			symbol.add("NSE:SCHAEFFLER");
			symbol.add("NSE:SHARDACROP");
			symbol.add("NSE:SHANKARA");
			symbol.add("NSE:SIEMENS");
			symbol.add("NSE:SJVN");
			symbol.add("NSE:SKFINDIA");
			symbol.add("NSE:SOLARINDS");
			symbol.add("NSE:SONACOMS");
			symbol.add("NSE:SONATSOFTW");
			symbol.add("NSE:SPLPETRO");
			symbol.add("NSE:SRF");
			symbol.add("NSE:SULA");
			symbol.add("NSE:SUMICHEM");
			symbol.add("NSE:SUPREMEIND");
			symbol.add("NSE:SUPRIYA");
			symbol.add("NSE:SWSOLAR");
			symbol.add("NSE:SYNGENE");
			symbol.add("NSE:TANLA");
			symbol.add("NSE:TARSONS");
			symbol.add("NSE:TATACHEM");
			symbol.add("NSE:TATACONSUM");
			symbol.add("NSE:TATAELXSI");
			symbol.add("NSE:TATAMOTORS");
			symbol.add("NSE:TATAPOWER");
			symbol.add("NSE:TATASTEEL");
			symbol.add("NSE:TATATECH");
			symbol.add("NSE:TATVA");
			symbol.add("NSE:TCIEXP");
			symbol.add("NSE:TCPLPACK");
			symbol.add("NSE:TCS");
			symbol.add("NSE:TECHM");
			symbol.add("NSE:THYROCARE");
			symbol.add("NSE:TIINDIA");
			symbol.add("NSE:TIMKEN");
			symbol.add("NSE:TIPSINDLTD");
			symbol.add("NSE:TITAN");
			symbol.add("NSE:TORNTPOWER");
			symbol.add("NSE:TRENT");
			symbol.add("NSE:TRIVENI");
			symbol.add("NSE:ULTRACEMCO");
			symbol.add("NSE:UNOMINDA");
			symbol.add("NSE:USHAMART");
			symbol.add("NSE:VAIBHAVGBL");
			symbol.add("NSE:VBL");
			symbol.add("NSE:VINATIORGA");
			symbol.add("NSE:WIPRO");
			symbol.add("NSE:WONDERLA");
			symbol.add("NSE:ZEEL");
			symbol.add("NSE:ZYDUSLIFE");
			symbol.add("NSE:ZYDUSWELL");

			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//drivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("https://in.tradingview.com/chart/?symbol=NSE%3ANIFTY");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='header-toolbar-intervals']/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(), '1 month')]")).click();
			Thread.sleep(15000);
			driver.navigate().to("https://in.tradingview.com/chart/?symbol=BSE%3ASENSEX");
			driver.switchTo().alert().accept();
			Thread.sleep(15000);
		   
			for(String name : symbol ) {
				
				driver.navigate().to("https://in.tradingview.com/chart/?symbol=" + name + "");
				System.out.println("https://in.tradingview.com/chart/?symbol=" + name + "");
				Thread.sleep(15000);
			}
			
	    }
}

