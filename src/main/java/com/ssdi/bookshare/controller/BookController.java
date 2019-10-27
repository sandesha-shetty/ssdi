//package com.ssdi.bookshare.controller;
//
//import com.ssdi.bookshare.model.Book;
//import com.ssdi.bookshare.repository.BookRepository;
//import com.ssdi.bookshare.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1")
//public class BookController {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("/users/{userId}/books")
//    public List<Book> getBooksByUser(@PathVariable(value = "postId") Long userId) {
//        return bookRepository.findByUserId(userId);
//    }
//
//    @PostMapping("/users/{userId}/books")
//    public Book createCourse(@PathVariable(value = "userid") Long userId,
//                               @Valid @RequestBody Book book) throws Exception {
//        return userRepository.findById(userId).map(user -> {
//                book.setUser(user);
//        return bookRepository.save(book);
//        }).orElseThrow(()-> new Exception("user not found"));
//    }
//
//    @PutMapping("/instructors/{instructorId}/courses/{courseId}")
//    public Book updateBook(@PathVariable(value = "userId") Long userId,
//                               @PathVariable(value = "bookId") Long bookId, @Valid @RequestBody Book bookReq)
//            throws Exception {
//        if (!userRepository.existsById(userId)) {
//            throw new Exception("UserId not found");
//        }
//
//        return bookRepository.findById(bookId).map(book-> {
//                book.setTitle(bookReq.getTitle());
//        return bookRepository.save(book);
//        }).orElseThrow(()-> new Exception("book id not found"));
//    }
//
////    @DeleteMapping("/users/{userId}/books/{bookId}")
////    public ResponseEntity < ? > deleteCourse(@PathVariable(value = "instructorId") Long instructorId,
////                                              @PathVariable(value = "courseId") Long courseId) throws Exception {
////        return courseRepository.findByIdAndInstructorId(courseId, instructorId).map(course - > {
////                courseRepository.delete(course);
////        return ResponseEntity.ok().build();
////        }).orElseThrow(() - > new ResourceNotFoundException(
////                "Course not found with id " + courseId + " and instructorId " + instructorId));
////    }
//}
