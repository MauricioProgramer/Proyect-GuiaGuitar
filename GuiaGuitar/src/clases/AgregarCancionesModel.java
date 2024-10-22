package clases;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Programación
 */
public class AgregarCancionesModel {

    private static List<BandasDTO> listaCanciones = new ArrayList<>();

    public void agregarCancion() throws IOException {

        InputStream excelFilePath = getClass().getResourceAsStream("/packCanciones/Musica.xlsx");

        try (Workbook workbook = new XSSFWorkbook(excelFilePath)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (int rowIndex = 1; rowIndex < sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                if (row == null) {
                    return;
                }

                String nombreBanda = row.getCell(0).getStringCellValue();
                String nombreCancion = row.getCell(1).getStringCellValue();
                String dificultad = row.getCell(2).getStringCellValue();
                String dificultadFacil = getCellValueAsString(row.getCell(3));
                String dificultadMedio = getCellValueAsString(row.getCell(4));
                String dificultadDificil = getCellValueAsString(row.getCell(5));
                String dificultadExperto = getCellValueAsString(row.getCell(6));
                String comboFacil = getCellValueAsString(row.getCell(7));
                String comboMedio = getCellValueAsString(row.getCell(8));
                String comboDificil = getCellValueAsString(row.getCell(9));
                String comboExperto = getCellValueAsString(row.getCell(10));

                BandasDTO cancion = new BandasDTO(nombreBanda, nombreCancion,
                        dificultad, dificultadFacil, dificultadMedio,
                        dificultadDificil, dificultadExperto, comboFacil,
                        comboMedio, comboDificil, comboExperto);

                listaCanciones.add(cancion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<BandasDTO> mostrarListaCanciones() {
        return listaCanciones;
    }

    private static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return "";
        } else if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else if (cell.getCellType() == CellType.BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else {
            return "";
        }
    }
}
