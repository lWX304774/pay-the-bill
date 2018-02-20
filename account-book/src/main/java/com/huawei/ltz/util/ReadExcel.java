package com.huawei.ltz.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel
{
    private static Logger logger = Logger.getLogger(ReadExcel.class.toString());
    
    private void babe()
    {
        String filename = "";
        String[] data = new String[10];
        File file = new File(filename);
        BufferedReader bufRdr = null;
        try
        {
            bufRdr = new BufferedReader(new FileReader(file));
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String line = null;
        int col = 0;
        try
        {
            line = bufRdr.readLine();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } //read the first title line
          //read each line of text file
        try
        {
            boolean link = false;
            while ((line = bufRdr.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(line, ",");
                while (st.hasMoreTokens())
                {
                    data[col] = st.nextToken();
                    col++;
                }
                col = 0;
                String name = data[0];
                if (name.equals("Link"))
                {
                    link = true;
                }
                if (!link)//node operation
                {
                    int x = Integer.parseInt(data[1]);
                    int y = Integer.parseInt(data[2]);
                    //                    int index = layer.getNodelist().size();
                    //                    Node newnode = new Node(name, index, "", layer, x, y);
                    //                    layer.addNode(newnode);
                }
                else
                { //link operation
                    if (!(name.equals("Link")))
                    {
                        //                        Node nodeA = layer.getNodelist().get(data[1]);                      
                        //                        Node nodeB = layer.getNodelist().get(data[2]);
                        //                        double length = Double.parseDouble(data[3]);
                        //                        double cost = Double.parseDouble(data[4]);
                        //                        int index = layer.getLinklist().size();
                        //                        Link newlink = new Link(name,index,"",layer,nodeA,nodeB,length,cost);
                        //                        layer.addLink(newlink);
                        //update the neighbor node list
                        //nodeA.addNeiNode(nodeB);
                        //nodeB.addNeiNode(nodeA);
                    }
                }
            }
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try
        {
            bufRdr.close();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void readExcelFrom(String file)
    {
        InputStream inp;
        try
        {
            inp = new FileInputStream(file);
            
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(2);
            Cell cell = row.getCell(3);
            if (cell == null)
                cell = row.createCell(3);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            cell.setCellValue("a test");
            
            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream("workbook.xls");
            wb.write(fileOut);
            fileOut.close();
        }
        catch (FileNotFoundException e)
        {
            logger.error("file: " + file + " not found!");
            e.printStackTrace();
        }
        catch (InvalidFormatException e)
        {
            logger.error("InvalidFormatException!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            logger.error("IOException!");
            e.printStackTrace();
        }
    }
}
