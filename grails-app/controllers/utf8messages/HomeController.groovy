package utf8messages

class HomeController {
	def index() {
		return render(text: message(code: 'test.utf8.message'), encoding: 'UTF-8')
	}
}
