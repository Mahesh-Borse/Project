package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.net.URL;

public class Download_PDF_Activity extends AppCompatActivity {

    URL url1, url2, url3, url4, url5, url6, url7, url8, url9;
    String fileName1, fileName2, fileName3, fileName4, fileName5, fileName6, fileName7, fileName8, fileName9;
    TextView txtvw1, txtvw2, txtvw3, txtvw4, txtvw5, txtvw6, txtvw7, txtvw8, txtvw9;
    Button
         downloadBtn1, downloadBtn2, downloadBtn3, downloadBtn4, downloadBtn5, downloadBtn6, downloadBtn7, downloadBtn8, downloadBtn9,
         viewPDFbtn1, viewPDFbtn2, viewPDFbtn3, viewPDFbtn4, viewPDFbtn5, viewPDFbtn6, viewPDFbtn7, viewPDFbtn8, viewPDFbtn9;
    String
         filePath1 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Practice_Pre_Writting.pdf",
         filePath2 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Alphabets_Tracing.pdf",
         filePath3 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Line_Tracing.pdf",
         filePath4 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Line_Tracing-2.pdf",
         filePath5 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Numbers_Tracing.pdf",
         filePath6 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Numbers_Tracing-2.pdf",
         filePath7 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Picture_Matching_Worksheet_1.png",
         filePath8 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Picture_Matching_Worksheet_2.png",
         filePath9 = "https://github.com/Mahesh-Borse/pro-res/raw/main/Picture_Matching_Worksheet_3.png";
        //"android.resource://" + getPackageName() +"/"+ R.raw.prewriting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_pdf);

//        initViews();
        startDownload();

        Button btn = (Button) findViewById(R.id.BackToHome);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToHome();
            }
        });
    }

    private void startDownload() {

        txtvw1 = findViewById(R.id.fileName1);
        txtvw2 = findViewById(R.id.fileName2);
        txtvw3 = findViewById(R.id.fileName3);
        txtvw4 = findViewById(R.id.fileName4);
        txtvw5 = findViewById(R.id.fileName5);
        txtvw6 = findViewById(R.id.fileName6);
        txtvw7 = findViewById(R.id.fileName7);
        txtvw8 = findViewById(R.id.fileName8);
        txtvw9 = findViewById(R.id.fileName9);

        downloadBtn1 = findViewById(R.id.idDownloadPDF1);
        downloadBtn2 = findViewById(R.id.idDownloadPDF2);
        downloadBtn3 = findViewById(R.id.idDownloadPDF3);
        downloadBtn4 = findViewById(R.id.idDownloadPDF4);
        downloadBtn5 = findViewById(R.id.idDownloadPDF5);
        downloadBtn6 = findViewById(R.id.idDownloadPDF6);
        downloadBtn7 = findViewById(R.id.idDownloadPDF7);
        downloadBtn8 = findViewById(R.id.idDownloadPDF8);
        downloadBtn9 = findViewById(R.id.idDownloadPDF9);

        viewPDFbtn1 = findViewById(R.id.idviewWorksheet1);
        viewPDFbtn2 = findViewById(R.id.idviewWorksheet2);
        viewPDFbtn3 = findViewById(R.id.idviewWorksheet3);
        viewPDFbtn4 = findViewById(R.id.idviewWorksheet4);
        viewPDFbtn5 = findViewById(R.id.idviewWorksheet5);
        viewPDFbtn6 = findViewById(R.id.idviewWorksheet6);
        viewPDFbtn7 = findViewById(R.id.idviewWorksheet7);
        viewPDFbtn8 = findViewById(R.id.idviewWorksheet8);
        viewPDFbtn9 = findViewById(R.id.idviewWorksheet9);


        try {
            url1 = new URL(filePath1);
            url2 = new URL(filePath2);
            url3 = new URL(filePath3);
            url4 = new URL(filePath4);
            url5 = new URL(filePath5);
            url6 = new URL(filePath6);
            url7 = new URL(filePath7);
            url8 = new URL(filePath8);
            url9 = new URL(filePath9);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        fileName1 = url1.getPath();
        fileName1 = fileName1.substring(fileName1.lastIndexOf('/')+1);
        txtvw1.setText(fileName1);

        fileName2 = url2.getPath();
        fileName2 = fileName2.substring(fileName2.lastIndexOf('/')+1);
        txtvw2.setText(fileName2);

        fileName3 = url3.getPath();
        fileName3 = fileName3.substring(fileName3.lastIndexOf('/')+1);
        txtvw3.setText(fileName3);

        fileName4 = url4.getPath();
        fileName4 = fileName4.substring(fileName4.lastIndexOf('/')+1);
        txtvw4.setText(fileName4);

        fileName5 = url5.getPath();
        fileName5 = fileName5.substring(fileName5.lastIndexOf('/')+1);
        txtvw5.setText(fileName5);

        fileName6 = url6.getPath();
        fileName6 = fileName6.substring(fileName6.lastIndexOf('/')+1);
        txtvw6.setText(fileName6);

        fileName7 = url7.getPath();
        fileName7 = fileName7.substring(fileName7.lastIndexOf('/')+1);
        txtvw7.setText(fileName7);

        fileName8 = url8.getPath();
        fileName8 = fileName8.substring(fileName8.lastIndexOf('/')+1);
        txtvw8.setText(fileName8);

        fileName9 = url9.getPath();
        fileName9 = fileName9.substring(fileName9.lastIndexOf('/')+1);
        txtvw9.setText(fileName9);


        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url1+""));
                req.setTitle(fileName1);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName1);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url2+""));
                req.setTitle(fileName2);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName2);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url3+""));
                req.setTitle(fileName3);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName3);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url4+""));
                req.setTitle(fileName4);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName4);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url5+""));
                req.setTitle(fileName5);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName5);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url6+""));
                req.setTitle(fileName6);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName6);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url7+""));
                req.setTitle(fileName7);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName7);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url8+""));
                req.setTitle(fileName8);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName8);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

        downloadBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url9+""));
                req.setTitle(fileName9);
                req.setMimeType("application/pdf");
                req.allowScanningByMediaScanner();
                req.setAllowedOverMetered(true);
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                req.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName9);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
            }
        });

    }

    public void backToHome(){
        Intent intent = new Intent(this, Home_Page_Activity.class);
        startActivity(intent);
    }
}