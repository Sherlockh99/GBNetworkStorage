module com.sherlock.gb.networkstorage.gbnetworkstorage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sherlock.gb.networkstorage.gbnetworkstorage to javafx.fxml;
    exports com.sherlock.gb.networkstorage.gbnetworkstorage;
}