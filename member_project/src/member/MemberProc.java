package member;

import java.util.List;
import java.util.Scanner;


public class MemberProc {
	   
    MemberDAO dao;
   
    //기본생성자
    public MemberProc() {
        dao = new MemberDAO();
           
       
    }
   
    /**
    * 회원 등록처리
    */
    public void insertMember(){        
       
        Scanner sc = new Scanner(System.in);
       
        System.out.println("회원정보를 입력해주세요.");
        System.out.print("▶이름 : ");
        String name = sc.nextLine();
        System.out.print("▶주민번호 : ");
        String ssn = sc.nextLine();
        System.out.print("▶연락처 : ");
        String phoneNum = sc.nextLine();    
          
       
        MemberDTO dto = new MemberDTO(name, ssn, phoneNum);    
        boolean r = dao.insertMember(dto); //입력받은 데이터 추가
       
        if(r){
            System.out.println("회원등록이 정상적으로 완료되었습니다.");
        }else{
            System.out.println("회원등록이 정상적으로 이루지지 않았습니다.");
        }
       
    }  
  

	/**
    * 저장된 회원 목록 보기
    */
    public void showMemberList(){
   
        List<MemberDTO> list = dao.getMemberList();
       
        System.out.println("                              회원 목록");
        System.out.println("============================================================================");
        if(list!=null&&list.size()>0){         
            System.out.println(" No\t 이름\t\t주민번호\t\t\t연락처\t\t등록일");
            System.out.println("============================================================================");
           
            for (MemberDTO dto : list){
                System.out.println(dto);
            }          
           
        }else{
            System.out.println("저장된 데이터가 없습니다. ");
        }
        System.out.println("====================================================================총 "+((list==null)?"0":list.size())+" 명=\n");
    }
   
   
    /**
    * 회원 수정.
    */
    public void updateMember(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 회원의 회원등록번호를 입력해주세요");
        System.out.print("▶");
        String no = sc.nextLine();
        MemberDTO dto = dao.getMember(no);
        if (dto!=null) {
           
            System.out.println(dto.getInfo());
           
           
            System.out.println("수정작업을 계속하시겠습니까?(Y/N)");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("y")){
                System.out.println("입력을 하시지않으면 기존의 정보가 그대로 유지됩니다.");
                System.out.print("▶수정할 이름 : ");
                String name = sc.nextLine();
                if(name.trim().equals("")) name=dto.getName();
                System.out.print("▶수정할 주민번호 : ");
                String ssn = sc.nextLine();
                if(ssn.trim().equals("")) ssn=dto.getSsn();
                System.out.print("▶수정할 전화번호 : ");
                String phoneNum = sc.nextLine();
                if(phoneNum.trim().equals("")) phoneNum=dto.getPhoneNum();
               
                dto =  new MemberDTO(no, name, ssn, phoneNum,dto.getRegistdate());
               
                boolean r = dao.updateMember(dto);
               
                if(r){
                   
                    System.out.println("회원의 정보가 다음과 같이 수정되었습니다.");
                    System.out.println(dto.getInfo());
                   
                }else{
                    System.out.println("회원의 정보가 정상적으로 수정 되지 않았습니다.");
                }
               
            }else{
                System.out.println("수정 작업을 취소하였습니다.");
            }
           
        }else{
           
            System.out.println("입력하신 회원등록번호에 해당하는 회원이 존재하지 않습니다.");
           
        }
    }
   
    /**
    * 회원 삭제
    */
    public void deleteMember(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 회원의 회원등록번호를 입력해주세요");
        String no = sc.nextLine();
        MemberDTO dto = dao.getMember(no);
        if (dto!=null) {
            System.out.println(dto.getInfo());
           
            System.out.println("위 회원의 정보를 정말로 삭제하시겠습니까?(Y/N)");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("y")){
                boolean bn = dao.deleteMember(no);
               
                if(bn){
                    System.out.println(no+"회원의 정보가 정상적으로 삭제되었습니다.");
                }else{
                    System.out.println("회원의 정보가 정상적으로 삭제 되지 않았습니다.");
                }
            }else{
                System.out.println("삭제 작업을 취소하였습니다.");
            }
        }else{
           
            System.out.println("입력하신 회원등록번호에 해당하는 회원이 존재하지 않습니다.");
           
        }
    }
}