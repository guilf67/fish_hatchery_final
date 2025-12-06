package com.example.fish_hatchery_final.Akkhorik;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class inventorycontroller {

    // Data Storage (In-Memory)
    private final ObservableList<FeedStock> feedStockList = FXCollections.observableArrayList();
    private final ObservableList<Material> materialsList = FXCollections.observableArrayList();
    private final ObservableList<StockLevel> stockLevelsList = FXCollections.observableArrayList();
    private final ObservableList<UsageReport> usageReportList = FXCollections.observableArrayList();
    private final Map<String, Integer> currentStock = new HashMap<>();

    // Feed Stock Table
    @FXML
    private TableView<FeedStock> feedStockTable;
    @FXML
    private TableColumn<FeedStock, String> feedItemNameCol;
    @FXML
    private TableColumn<FeedStock, Integer> feedQuantityCol;
    @FXML
    private TableColumn<FeedStock, String> feedBatchNumberCol;
    @FXML
    private TableColumn<FeedStock, String> feedSupplierCol;
    @FXML
    private TableColumn<FeedStock, String> feedExpiryDateCol;

    // Materials Table
    @FXML
    private TableView<Material> materialsTable;
    @FXML
    private TableColumn<Material, String> materialItemCol;
    @FXML
    private TableColumn<Material, String> materialTypeCol;
    @FXML
    private TableColumn<Material, Integer> materialQuantityCol;

    // Stock Levels Table
    @FXML
    private TableView<StockLevel> stockLevelsTable;
    @FXML
    private TableColumn<StockLevel, String> stockItemCol;
    @FXML
    private TableColumn<StockLevel, Integer> stockQuantityCol;
    @FXML
    private TableColumn<StockLevel, String> stockStatusCol;

    // Report Table
    @FXML
    private TableView<UsageReport> reportTable;
    @FXML
    private TableColumn<UsageReport, String> reportItemCol;
    @FXML
    private TableColumn<UsageReport, Integer> reportUsedQuantityCol;
    @FXML
    private TableColumn<UsageReport, String> reportUsedByCol;
    @FXML
    private TableColumn<UsageReport, String> reportDateCol;

    // Input Fields
    @FXML
    private TextField feedItemName;
    @FXML
    private TextField feedQuantity;
    @FXML
    private TextField feedBatchNumber;
    @FXML
    private TextField feedSupplier;
    @FXML
    private DatePicker feedExpiryDate;
    @FXML
    private TextField materialItem;
    @FXML
    private ComboBox<String> materialType;
    @FXML
    private TextField usedQuantity;
    @FXML
    private TextField usedBy;
    @FXML
    private DatePicker usageDate;
    @FXML
    private TextField itemToCheck;
    @FXML
    private TextField reorderAmount;

    // Labels and Text Areas
    @FXML
    private Label currentStockLabel;
    @FXML
    private Label reorderStatus;
    @FXML
    private TextArea inventoryReport;
    @FXML
    private DatePicker inventoryReportMonth;

    // Model Classes
    public static class FeedStock {
        private String itemName;
        private int quantity;
        private String batchNumber;
        private String supplier;
        private String expiryDate;

        public FeedStock(String itemName, int quantity, String batchNumber, String supplier, String expiryDate) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.batchNumber = batchNumber;
            this.supplier = supplier;
            this.expiryDate = expiryDate;
        }

        public String getItemName() { return itemName; }
        public int getQuantity() { return quantity; }
        public String getBatchNumber() { return batchNumber; }
        public String getSupplier() { return supplier; }
        public String getExpiryDate() { return expiryDate; }

        public void setQuantity(int quantity) { this.quantity = quantity; }
    }

    public static class Material {
        private String itemName;
        private String type;
        private int quantity;

        public Material(String itemName, String type, int quantity) {
            this.itemName = itemName;
            this.type = type;
            this.quantity = quantity;
        }

        public String getItemName() { return itemName; }
        public String getType() { return type; }
        public int getQuantity() { return quantity; }

        public void setQuantity(int quantity) { this.quantity = quantity; }
    }

    public static class StockLevel {
        private String itemName;
        private int quantity;
        private String status;

        public StockLevel(String itemName, int quantity, String status) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.status = status;
        }

        public String getItemName() { return itemName; }
        public int getQuantity() { return quantity; }
        public String getStatus() { return status; }
    }

    public static class UsageReport {
        private String itemName;
        private int usedQuantity;
        private String usedBy;
        private String date;

        public UsageReport(String itemName, int usedQuantity, String usedBy, String date) {
            this.itemName = itemName;
            this.usedQuantity = usedQuantity;
            this.usedBy = usedBy;
            this.date = date;
        }

        public String getItemName() { return itemName; }
        public int getUsedQuantity() { return usedQuantity; }
        public String getUsedBy() { return usedBy; }
        public String getDate() { return date; }
    }

    @FXML
    public void initialize() {
        // Initialize ComboBox
        materialType.setItems(FXCollections.observableArrayList(
                "Feed", "Medicine", "Equipment", "Chemical", "Other"
        ));

        // Initialize Feed Stock Table Columns
        feedItemNameCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        feedQuantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        feedBatchNumberCol.setCellValueFactory(new PropertyValueFactory<>("batchNumber"));
        feedSupplierCol.setCellValueFactory(new PropertyValueFactory<>("supplier"));
        feedExpiryDateCol.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));

        // Initialize Materials Table Columns
        materialItemCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        materialTypeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        materialQuantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        // Initialize Stock Levels Table Columns
        stockItemCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        stockQuantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        stockStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Initialize Report Table Columns
        reportItemCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        reportUsedQuantityCol.setCellValueFactory(new PropertyValueFactory<>("usedQuantity"));
        reportUsedByCol.setCellValueFactory(new PropertyValueFactory<>("usedBy"));
        reportDateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        // Set table data
        feedStockTable.setItems(feedStockList);
        materialsTable.setItems(materialsList);
        stockLevelsTable.setItems(stockLevelsList);
        reportTable.setItems(usageReportList);

        // Add some sample data
        addSampleData();
    }

    private void addSampleData() {
        // Add sample feed stock
        feedStockList.add(new FeedStock("Premium Fish Feed", 200, "FF2024001", "AquaFeeds Inc.", "2024-12-31"));
        feedStockList.add(new FeedStock("Growth Formula", 150, "GF2024001", "Marine Nutrition", "2025-06-30"));
        feedStockList.add(new FeedStock("Basic Fish Pellets", 300, "BP2024002", "Fish Farm Supply", "2024-10-15"));

        // Add sample materials
        materialsList.add(new Material("Fish Feed A", "Feed", 100));
        materialsList.add(new Material("Vitamin C", "Medicine", 30));
        materialsList.add(new Material("Water Test Kit", "Equipment", 15));
        materialsList.add(new Material("Aquarium Net", "Equipment", 25));
        materialsList.add(new Material("Water Conditioner", "Chemical", 40));

        // Add to current stock map
        for (FeedStock feed : feedStockList) {
            currentStock.put(feed.getItemName(), feed.getQuantity());
        }
        for (Material material : materialsList) {
            currentStock.put(material.getItemName(), material.getQuantity());
        }

        // Add sample usage reports
        usageReportList.add(new UsageReport("Fish Feed A", 10, "John Doe", "2024-01-15"));
        usageReportList.add(new UsageReport("Vitamin C", 5, "Jane Smith", "2024-01-16"));
        usageReportList.add(new UsageReport("Water Test Kit", 2, "Bob Wilson", "2024-01-17"));

        // Update stock levels
        updateStockLevels();
    }

    private void updateStockLevels() {
        stockLevelsList.clear();

        // Combine feed and materials
        for (FeedStock feed : feedStockList) {
            String status = getStockStatus(feed.getQuantity());
            stockLevelsList.add(new StockLevel(feed.getItemName(), feed.getQuantity(), status));
        }

        for (Material material : materialsList) {
            String status = getStockStatus(material.getQuantity());
            stockLevelsList.add(new StockLevel(material.getItemName(), material.getQuantity(), status));
        }
    }

    @FXML
    public void handleLogout(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/fish_hatchery_final/login.fxml"));
            Stage stage = (Stage) feedStockTable.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            showAlert("Error", "Failed to logout: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void handleRecordFeedStock(ActionEvent actionEvent) {
        if (validateFeedInput()) {
            try {
                String itemName = feedItemName.getText();
                int quantity = Integer.parseInt(feedQuantity.getText());
                String batchNumber = feedBatchNumber.getText();
                String supplier = feedSupplier.getText();
                String expiryDate = feedExpiryDate.getValue().toString();

                // Check if item already exists
                boolean itemExists = false;
                for (FeedStock feed : feedStockList) {
                    if (feed.getItemName().equalsIgnoreCase(itemName)) {
                        feed.setQuantity(feed.getQuantity() + quantity);
                        itemExists = true;
                        break;
                    }
                }

                if (!itemExists) {
                    feedStockList.add(new FeedStock(itemName, quantity, batchNumber, supplier, expiryDate));
                }

                // Update current stock
                currentStock.put(itemName, currentStock.getOrDefault(itemName, 0) + quantity);

                showAlert("Success", "Feed stock recorded successfully!", Alert.AlertType.INFORMATION);
                clearFeedFields();
                feedStockTable.refresh();
                updateStockLevels();

            } catch (Exception e) {
                showAlert("Error", "Failed to record feed stock: " + e.getMessage(), Alert.AlertType.ERROR);
            }
        }
    }

    @FXML
    public void handleRecordMaterialUsage(ActionEvent actionEvent) {
        if (validateMaterialUsageInput()) {
            try {
                String itemName = materialItem.getText();
                int usedQty = Integer.parseInt(usedQuantity.getText());
                String user = usedBy.getText();
                String date = usageDate.getValue().toString();

                // Check if material exists and has enough stock
                Material selectedMaterial = null;
                for (Material material : materialsList) {
                    if (material.getItemName().equalsIgnoreCase(itemName)) {
                        selectedMaterial = material;
                        break;
                    }
                }

                if (selectedMaterial == null) {
                    showAlert("Error", "Material not found in inventory!", Alert.AlertType.ERROR);
                    return;
                }

                if (selectedMaterial.getQuantity() < usedQty) {
                    showAlert("Error", "Insufficient stock! Available: " + selectedMaterial.getQuantity(),
                            Alert.AlertType.ERROR);
                    return;
                }

                // Update material quantity
                selectedMaterial.setQuantity(selectedMaterial.getQuantity() - usedQty);

                // Update current stock
                currentStock.put(itemName, currentStock.get(itemName) - usedQty);

                // Record usage
                usageReportList.add(new UsageReport(itemName, usedQty, user, date));

                showAlert("Success", "Material usage recorded successfully!", Alert.AlertType.INFORMATION);
                clearMaterialUsageFields();

                // Refresh tables
                materialsTable.refresh();
                reportTable.refresh();
                updateStockLevels();

            } catch (Exception e) {
                showAlert("Error", "Failed to record material usage: " + e.getMessage(), Alert.AlertType.ERROR);
            }
        }
    }

    @FXML
    public void handleInitiateReorder(ActionEvent actionEvent) {
        String itemName = materialItem.getText();
        String amountText = reorderAmount.getText();

        if (itemName.isEmpty() || amountText.isEmpty()) {
            showAlert("Input Error", "Please enter item name and reorder amount", Alert.AlertType.WARNING);
            return;
        }

        try {
            int reorderAmountValue = Integer.parseInt(amountText);

            if (reorderAmountValue <= 0) {
                showAlert("Input Error", "Reorder amount must be positive", Alert.AlertType.WARNING);
                return;
            }

            // Check if item exists
            boolean itemExists = false;
            for (Material material : materialsList) {
                if (material.getItemName().equalsIgnoreCase(itemName)) {
                    itemExists = true;
                    break;
                }
            }

            for (FeedStock feed : feedStockList) {
                if (feed.getItemName().equalsIgnoreCase(itemName)) {
                    itemExists = true;
                    break;
                }
            }

            if (!itemExists) {
                showAlert("Warning", "Item not found in inventory. Adding as new item.", Alert.AlertType.WARNING);
                // Add as new material
                materialsList.add(new Material(itemName, "Other", reorderAmountValue));
                currentStock.put(itemName, reorderAmountValue);
            } else {
                // Update existing item
                for (Material material : materialsList) {
                    if (material.getItemName().equalsIgnoreCase(itemName)) {
                        material.setQuantity(material.getQuantity() + reorderAmountValue);
                        currentStock.put(itemName, currentStock.get(itemName) + reorderAmountValue);
                        break;
                    }
                }

                for (FeedStock feed : feedStockList) {
                    if (feed.getItemName().equalsIgnoreCase(itemName)) {
                        feed.setQuantity(feed.getQuantity() + reorderAmountValue);
                        currentStock.put(itemName, currentStock.get(itemName) + reorderAmountValue);
                        break;
                    }
                }
            }

            reorderStatus.setText("Reorder completed for " + itemName + " (" + reorderAmountValue + " units)");
            reorderStatus.setStyle("-fx-text-fill: green;");

            reorderAmount.clear();
            materialItem.clear();

            // Refresh tables
            materialsTable.refresh();
            feedStockTable.refresh();
            updateStockLevels();

        } catch (NumberFormatException e) {
            showAlert("Input Error", "Please enter a valid number for reorder amount", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void handleCheckStockLevel(ActionEvent actionEvent) {
        String itemName = itemToCheck.getText().trim();

        if (itemName.isEmpty()) {
            showAlert("Input Error", "Please enter an item name", Alert.AlertType.WARNING);
            return;
        }

        if (currentStock.containsKey(itemName)) {
            int quantity = currentStock.get(itemName);
            String status = getStockStatus(quantity);
            currentStockLabel.setText(itemName + ": " + quantity + " units - " + status);
            currentStockLabel.setStyle(getStatusStyle(status));
        } else {
            // Check in tables directly
            boolean found = false;
            for (Material material : materialsList) {
                if (material.getItemName().equalsIgnoreCase(itemName)) {
                    String status = getStockStatus(material.getQuantity());
                    currentStockLabel.setText(itemName + ": " + material.getQuantity() + " units - " + status);
                    currentStockLabel.setStyle(getStatusStyle(status));
                    found = true;
                    break;
                }
            }

            if (!found) {
                for (FeedStock feed : feedStockList) {
                    if (feed.getItemName().equalsIgnoreCase(itemName)) {
                        String status = getStockStatus(feed.getQuantity());
                        currentStockLabel.setText(itemName + ": " + feed.getQuantity() + " units - " + status);
                        currentStockLabel.setStyle(getStatusStyle(status));
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                currentStockLabel.setText("Item not found in inventory");
                currentStockLabel.setStyle("-fx-text-fill: red;");
            }
        }
    }

    @FXML
    public void handleGenerateInventoryReport(ActionEvent actionEvent) {
        if (inventoryReportMonth.getValue() == null) {
            showAlert("Input Error", "Please select a month", Alert.AlertType.WARNING);
            return;
        }

        LocalDate selectedMonth = inventoryReportMonth.getValue();
        String month = selectedMonth.format(DateTimeFormatter.ofPattern("yyyy-MM"));

        StringBuilder report = new StringBuilder();
        report.append("INVENTORY REPORT FOR ").append(month).append("\n");
        report.append("=====================================\n\n");

        // Total items count
        int totalItems = materialsList.size() + feedStockList.size();
        report.append("Total Items in Inventory: ").append(totalItems).append("\n\n");

        // Low stock items (less than 30 units)
        report.append("LOW STOCK ITEMS (Less than 30 units):\n");
        report.append("-------------------------------------\n");
        boolean hasLowStock = false;

        for (Material material : materialsList) {
            if (material.getQuantity() < 30) {
                hasLowStock = true;
                report.append(String.format("%-20s %10d units\n", material.getItemName(), material.getQuantity()));
            }
        }

        for (FeedStock feed : feedStockList) {
            if (feed.getQuantity() < 30) {
                hasLowStock = true;
                report.append(String.format("%-20s %10d units\n", feed.getItemName(), feed.getQuantity()));
            }
        }

        if (!hasLowStock) {
            report.append("No low stock items\n");
        }
        report.append("\n");

        // Monthly usage (filter by selected month)
        report.append("MONTHLY USAGE REPORT:\n");
        report.append("---------------------\n");
        boolean hasUsage = false;

        for (UsageReport usage : usageReportList) {
            if (usage.getDate().startsWith(month)) {
                hasUsage = true;
                report.append(String.format("%-20s %10d units (Used by: %s on %s)\n",
                        usage.getItemName(),
                        usage.getUsedQuantity(),
                        usage.getUsedBy(),
                        usage.getDate()));
            }
        }

        if (!hasUsage) {
            report.append("No usage recorded for this month\n");
        }

        report.append("\n");

        // Current stock summary
        report.append("CURRENT STOCK SUMMARY:\n");
        report.append("---------------------\n");
        for (StockLevel stock : stockLevelsList) {
            report.append(String.format("%-20s %10d units [%s]\n",
                    stock.getItemName(),
                    stock.getQuantity(),
                    stock.getStatus()));
        }

        inventoryReport.setText(report.toString());
    }

    // Validation Methods
    private boolean validateFeedInput() {
        if (feedItemName.getText().isEmpty() || feedQuantity.getText().isEmpty() ||
                feedBatchNumber.getText().isEmpty() || feedSupplier.getText().isEmpty() ||
                feedExpiryDate.getValue() == null) {
            showAlert("Input Error", "Please fill all feed stock fields", Alert.AlertType.WARNING);
            return false;
        }

        try {
            int quantity = Integer.parseInt(feedQuantity.getText());
            if (quantity <= 0) {
                showAlert("Input Error", "Quantity must be positive", Alert.AlertType.WARNING);
                return false;
            }
        } catch (NumberFormatException e) {
            showAlert("Input Error", "Quantity must be a number", Alert.AlertType.ERROR);
            return false;
        }

        if (feedExpiryDate.getValue().isBefore(LocalDate.now())) {
            showAlert("Input Error", "Expiry date cannot be in the past", Alert.AlertType.WARNING);
            return false;
        }

        return true;
    }

    private boolean validateMaterialUsageInput() {
        if (materialItem.getText().isEmpty() || usedQuantity.getText().isEmpty() ||
                usedBy.getText().isEmpty() || usageDate.getValue() == null) {
            showAlert("Input Error", "Please fill all material usage fields", Alert.AlertType.WARNING);
            return false;
        }

        try {
            int qty = Integer.parseInt(usedQuantity.getText());
            if (qty <= 0) {
                showAlert("Input Error", "Quantity must be positive", Alert.AlertType.WARNING);
                return false;
            }
        } catch (NumberFormatException e) {
            showAlert("Input Error", "Quantity must be a number", Alert.AlertType.ERROR);
            return false;
        }

        return true;
    }

    // Helper Methods
    private String getStockStatus(int quantity) {
        if (quantity > 50) return "Adequate";
        else if (quantity > 20) return "Low";
        else return "Critical";
    }

    private String getStatusStyle(String status) {
        switch (status) {
            case "Adequate": return "-fx-text-fill: green;";
            case "Low": return "-fx-text-fill: orange;";
            case "Critical": return "-fx-text-fill: red;";
            default: return "-fx-text-fill: black;";
        }
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFeedFields() {
        feedItemName.clear();
        feedQuantity.clear();
        feedBatchNumber.clear();
        feedSupplier.clear();
        feedExpiryDate.setValue(null);
    }

    private void clearMaterialUsageFields() {
        materialItem.clear();
        usedQuantity.clear();
        usedBy.clear();
        usageDate.setValue(null);
    }
}