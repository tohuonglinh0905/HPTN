//package demo.nopcommerce.nopcommerce.dataprovider;
//
//import demo.nopcommerce.common.BaseConst;
//import demo.nopcommerce.helpers.ExcelHelpers;
//import demo.nopcommerce.nopcommerce.models.LoginModel;
//import lombok.var;
//import org.testng.annotations.DataProvider;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AddressesDataProvider {
//        final ExcelHelpers xlsReader = new ExcelHelpers();
//
//        @DataProvider(name = "addresses")
//        public Object[][] addresses() {
//            String xlsFileName = "Book3.xlsx";
//            String filePath = BaseConst.imgFolderPath + xlsFileName;
//
//            var data = xlsReader.readXLSData(filePath);
//            List<AddressesModel> addressesData = new ArrayList<>();
////            data.entrySet().stream().filter(v -> !v.getKey().equals("0")).forEach(v -> {
////                var rowData = data.get(v.getKey());
////
////                var  addressesModel = AddressesModel.builder().firstName(rowData.get(1)).lastName(rowData.get(2)).email(rowData.get(3)).city(rowData.get(4)).addresses1(rowData.get(5)).zip(rowData.get(6)).phone(rowData.get(7)).build();
////                addressesData.add(addressesModel);
////            });
//            data.entrySet().stream().filter(v -> !v.getKey().equals("0")).forEach(v -> {
//                var rowData = data.get(v.getKey());
//
//                String firstName = rowData.get(1);
//                String lastName = rowData.get(2);
//                String email = rowData.get(3);
//                String city = rowData.get(4);
//                String address1 = rowData.get(5);
//                String zip = rowData.get(6);
//                String phone = rowData.get(7);
//
//                // Kiểm tra giá trị không hợp lệ và xử lý
//                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || city.isEmpty() || address1.isEmpty() || zip.isEmpty() || phone.isEmpty()) {
//                    // Xử lý tình huống giá trị thiếu
//                    // Ví dụ: Gán giá trị mặc định hoặc bỏ qua dòng này
//                    return; // Bỏ qua dòng không hợp lệ và tiếp tục với dòng tiếp theo
//                }
//
//                // Xử lý dữ liệu hợp lệ
//                var addressesModel = AddressesModel.builder()
//                        .firstName(firstName)
//                        .lastName(lastName)
//                        .email(email)
//                        .city(city)
//                        .addresses1(address1)
//                        .zip(zip)
//                        .phone(phone)
//                        .build();
//
//                addressesData.add(addressesModel);
//            });
//
//            //System.out.println("Result" + loginData.get(1));
//            Object[][] result = new Object[addressesData.size()][1];
//            for (int i = 0; i < addressesData.size(); i++) {
//                result[i][0] = addressesData.get(i);
//            }
//            return result;
//        }
//    }
//
