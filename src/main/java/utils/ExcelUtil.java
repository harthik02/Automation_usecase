package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {

static XSSFWorkbook workbook;
static XSSFSheet sheet;

public static Object[][] getLoginData(){

Object data[][] = null;

try{

FileInputStream fis =
new FileInputStream(
"src/test/resources/LoginData.xlsx");

workbook = new XSSFWorkbook(fis);

sheet = workbook.getSheet("Sheet1");

int rowCount =
sheet.getPhysicalNumberOfRows();

int colCount =
sheet.getRow(0).getLastCellNum();

data = new Object[rowCount-1][colCount];

for(int i=1;i<rowCount;i++){
for(int j=0;j<colCount;j++){

data[i-1][j] =
sheet.getRow(i)
.getCell(j)
.toString();
}
}

}catch(Exception e){
e.printStackTrace();
}

return data;
}
}